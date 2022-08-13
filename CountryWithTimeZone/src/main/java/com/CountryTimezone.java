package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Servlet implementation class CountryTimezone
 */
public class CountryTimezone extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Date d=new Date();
		DateFormat df=new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String zone=request.getParameter("country");
		PrintWriter out=response.getWriter();
		df.setTimeZone(TimeZone.getTimeZone(zone));
		out.println("Date and time in "+zone+ ":" + df.format(d));
	}

}
