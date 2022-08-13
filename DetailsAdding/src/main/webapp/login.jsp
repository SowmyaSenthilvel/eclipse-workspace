<%@ page import="java.sql.*"%>


<%
String name=request.getParameter("username");
String pass=request.getParameter("password");
String mobile=request.getParameter("mobilenumber");
String mail=request.getParameter("email");
try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost/detailsdatabase","root","root");
	PreparedStatement st=con.prepareStatement("insert into logindatabase(username,password,mobilenumber,email) values(?,?,?,?)");
	st.setString(1, name);
	st.setString(2, pass);
	st.setString(3, mobile);
	st.setString(4, mail);
	st.execute();
	response.sendRedirect("detailsSaving.html");
}
catch(Exception e){
	e.printStackTrace();
	response.sendRedirect("error.html");
	
}
%>

