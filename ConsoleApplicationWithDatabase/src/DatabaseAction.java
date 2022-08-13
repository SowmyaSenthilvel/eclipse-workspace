import java.sql.*;

public class DatabaseAction {
	
	public static Account getAccountObject(long accno) {
		
		Account account = null;
		Connection conn = null;
		try {
			conn = getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from Accounts where Account_number = "+accno);
			if(rs.next()) {
				
				account = new Account(rs.getLong("account_number"));
				account.setAge(rs.getInt("age"));
				account.setBalance(rs.getLong("balance"));
				account.setName(rs.getString("name"));
				account.setPin(rs.getInt("pin"));
				
			}
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception in getting account object "+e);
		}
		return account;
	}
	
	public static  boolean validatePin(long accno, int pin) {
		Account acc = getAccountObject(accno);
		
		if(acc.getPin()==pin) {
			return true;
			
		}
		return false;
		
	}
	
	public static void updateAccount(Account acc) {
		
		if(acc == null)
			return;		
		Connection conn = null;
		try {
				conn = getConnection();
				PreparedStatement ps = conn.prepareStatement("update Accounts set name = ?, age = ?, balance = ?, pin = ? where account_number = ?");
				ps.setString(1, acc.getName());
				ps.setInt(2, acc.getAge());
				ps.setLong(3, acc.getBalance());
				ps.setInt(4, acc.getPin());
				int status = ps.executeUpdate();
				conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception in updating account using object "+e);
		}
		
	}
	
	public static Connection getConnection() {
		
		Connection con = null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/BankDatabase","root","root");  
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Exception in getting connection "+e);
		}  
		return con;
	}
	
	public static void addAccount(String name, int age, long mobile,int pin) {

		Connection conn = null;
		
		try {
				conn = getConnection();
				PreparedStatement st = conn.prepareStatement("insert into Accounts(Account_Name, age, mobile,Account_pin) values(?,?,?,?)");
				st.setString(1, name);
				st.setInt(2, age);
				st.setLong(3, mobile);
				st.setInt(4, pin);
				int rs = st.executeUpdate();
				System.out.println("Account created successfully "+rs);
				conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception in adding account "+e);
		}
	}
	
	public static boolean getAccount(long AccNo ) {
		Connection conn;
		boolean result=false;
		try {
			conn = getConnection();
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("select * from Accounts where Account_Number="+AccNo);
			result=rs.next();
			conn.close();
	}
	catch(Exception e) {
		e.printStackTrace();
		System.out.println("Exception in adding account "+e);
	}
	return false;
		
	}
	
	public static void createTransaction(long accountNumber,long amount, String status, String type, long balance) {
		
		Connection conn = null;
		try {
			
			PreparedStatement ps = conn.prepareStatement("insert into transaction(amount,current_balance,type,status,account_number) values(?,?,?,?,?)");
			ps.setLong(1, amount);
			ps.setLong(2, balance);
			ps.setString(3, type);
			ps.setString(4, status);
			ps.setLong(5, accountNumber);
			int st = ps.executeUpdate();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception in creating transaction "+e);
		}
	}
	
	public static void deposit(long accountNumber,long amount) {
		Account acc = getAccountObject(accountNumber);
		if(acc == null) {
			System.out.println("No such account exists with the given account number");
			return;
		}
		long bal = acc.getBalance() + amount;
		acc.setBalance(bal);
		updateAccount(acc);
		createTransaction(accountNumber,amount,Transaction.Status.SUCCESS.toString(),Transaction.Type.DEPOSIT.toString(),acc.getBalance());
		System.out.println("Transaction for Deposit of Rs."+amount+" to Account Number "+acc.getAccountNumber()+" is successful !!");

		
	}
	
	public static void withdraw(long accountNumber,long amount){
	
		Account acc = getAccountObject(accountNumber);
		if(acc == null) {
			System.out.println("No such account exists with the given account number");
			return;
		}
		if(acc.getBalance() < amount){

			System.out.println("Account "+acc.getAccountNumber()+" has lower balance than requested. Current Available balance is  "+acc.getBalance());
			createTransaction(accountNumber,amount,Transaction.Status.FAILURE.toString(),Transaction.Type.WITHDRAWAL.toString(),acc.getBalance());
			return;
		}

		long bal = acc.getBalance() - amount;
		acc.setBalance(bal);
		updateAccount(acc);
		createTransaction(accountNumber,amount,Transaction.Status.SUCCESS.toString(),Transaction.Type.WITHDRAWAL.toString(),bal);
		System.out.println("Transaction for Withdrawal of "+amount+" from "+acc.getAccountNumber()+" is successful !!");
		
	
	}
	
	public static void getStatement(long accountNumber){
		
		Account acc = getAccountObject(accountNumber);
		if(acc == null) {
			System.out.println("No such account exists with the given account number");
			return;
		}
		Connection conn = null;
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from transactions where account_number = "+accountNumber);
			conn.close();
			if(rs.wasNull()) {
				System.out.println("NO TRANSACTIONS FOR THE ACCOUNT");
				return;
			}
			System.out.println("TRANSACTION STATEMENT FOR ACCOUNT - "+accountNumber);
			System.out.println("TYPE   AMOUNT   STATUS   CURRENTBALANCE");
			while(rs.next()) {
				
				System.out.println(rs.getString("type")+" "+rs.getLong("amount")+" "+rs.getString("status")+" "+rs.getLong("balance"));
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception in creating transaction statements "+e);
		}
		
	}
	
	public static void moneyTransfer(long srcaccNumber, long destaccNumber,long amount) {
	
		Account srcacc = getAccountObject(srcaccNumber);
		Account destacc = getAccountObject(destaccNumber);
		if(srcacc == null) {
			System.out.println("No such account exists with the given account number "+srcaccNumber);
			return;
		}
		if(destacc == null) {
			System.out.println("No such account exists with the given account number "+destaccNumber);
			return;
		}
		if(srcacc.getBalance() < amount){

			System.out.println("Account "+srcacc.getAccountNumber()+" has lower balance than requested. Current Available balance is  "+srcacc.getBalance());
			createTransaction(srcaccNumber,amount,Transaction.Status.FAILURE.toString(),Transaction.Type.WITHDRAWAL.toString(),srcacc.getBalance());
			return;
		}
		withdraw(srcaccNumber,amount);
		deposit(destaccNumber,amount);
		System.out.println("Money Transfer is successful!!!");
	
	}
	

}
