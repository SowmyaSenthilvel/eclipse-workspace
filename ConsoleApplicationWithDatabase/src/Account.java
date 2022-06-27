import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Account {

	public static List<Account> accounts = new ArrayList<Account>();
	public static long accno = 1000000000000l;

	private long accountnumber;
	private String name;
	private int age;
	private long balance;
	private Stack<Transaction> transactions;
	private int pin;

	Account(String name, int age){

		this.name = name;
		this.age = age;
		this.accountnumber = accno++;
		this.balance = 0;
		this.transactions = new Stack<Transaction>();
		this.pin = 0;
		accounts.add(this);
	}

	public void setAccountNumber(long accnum){

		this.accountnumber = accnum;
	}

	public long getAccountNumber(){

		return this.accountnumber;

	}

	public void setName(String name){

		this.name = name;
	}

	public String getName(){

		return this.name;
	}

	public void setAge(int age){

		this.age = age;
	}

	public int getAge(){

		return this.age;
	}

	public void setBalance(long balance){

		this.balance = balance;
	}

	public long getBalance(){

		return this.balance;
	}

	public void setPin(int pin){
		
		this.pin = pin;
	}

	public int getPin(){

		return this.pin;
	}

	public void addTransaction(Transaction trans){

		this.transactions.push(trans);

	}

	public List<Transaction> getStatement(){
		
		List<Transaction> list = new ArrayList<Transaction>();
		int count = 0;
		Iterator iter = this.transactions.iterator();
		while(count < 10 && iter.hasNext()){
			list.add((Transaction)iter.next());
			count++;
		}
		return list;
	}

}
