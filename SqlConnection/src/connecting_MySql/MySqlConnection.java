package connecting_MySql;

import java.sql.*;

public class MySqlConnection {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/demodatabase","root","root");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from demotable");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			
		}
		con.close();
			
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
