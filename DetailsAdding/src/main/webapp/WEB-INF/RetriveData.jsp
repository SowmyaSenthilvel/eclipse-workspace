<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>


<h2 align="center">
	<font color="#FF00FF"><strong>Select query in JSP</strong></font>
</h2>
<table align="center" cellpadding="4" cellspacing="4">
	<tr>
	</tr>
	<tr bgcolor="#008000">
		<td><b>User Name</b></td>
		<td><b>Password</b></td>
		<td><b>Mobile Number</b></td>
		<td><b>Email </b></td>
	</tr>
	<%
	try {
		Statement statement;
		ResultSet resultSet = null;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/detailsdatabase", "root", "root");

		//connection = DriverManager.getConnection(
		//connectionUrl + dbName, userId, password);
		statement = con.createStatement();
		String sql = "SELECT * FROM logindatabase";
		resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
	%>
	<tr bgcolor="#8FBC8F">

		<td><%=resultSet.getString("username")%></td>
		<td><%=resultSet.getString("password")%></td>
		<td><%=resultSet.getString("mobilenumber")%></td>
		<td><%=resultSet.getString("email")%></td>


	</tr>

	<%
	}
	} catch (Exception e) {
	e.printStackTrace();
	}
	%>
</table>