import java.sql.*;
public class DatabaseAction {
	
	public Connection getConnection() {
		
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
	
	public void addAccount(String name, int age, long mobile,int pin) {

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

}
