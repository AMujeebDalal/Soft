package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class Test
 */
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
String a=request.getParameter("FirstName");
String b=request.getParameter("LastName");
String c=request.getParameter("DOB");
String d=request.getParameter("username");
String e=request.getParameter("password");
String f=request.getParameter("email");
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/soft","root","root");
PreparedStatement ps=con.prepareStatement("insert into users(FirstName,LastName,DOB,username,password,email) values(?,?,?,?,?,?)");
ps.setString(1,a);
ps.setString(2,b);
ps.setString(3,c);
ps.setString(4,d);
ps.setString(5,e);
ps.setString(6,f);
int i=ps.executeUpdate();
if(i>0)
{
	out.println("successfully registered");
}
	}
catch(Exception x)
{
	x.printStackTrace();
}

	}
}
