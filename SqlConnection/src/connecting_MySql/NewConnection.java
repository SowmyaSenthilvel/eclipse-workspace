package connecting_MySql;

import java.sql.*;

public class NewConnection {
	static Connection con;
	public NewConnection()
	{
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/Student?characterEncoding=latin1","root","root");  
		}catch(Exception e){ e.printStackTrace();}  
	}  
	

	public void executeStatement() {
		try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("Select * from studenttable")
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
