
import java.sql.*;
import java.sql.DriverManager;

public class GetConnection {

	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/detailsdatabase", "root", "root");
		} catch (Exception e) {
			System.out.println("Connection Failed");
		}
		return connection;
	}
}
