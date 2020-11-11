package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String u=request.getParameter("username");
		String p=request.getParameter("password");
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/soft","root","root");
			
			PreparedStatement ps=con.prepareStatement("select * from users where username=? and password=?");
			ps.setString(1, u);
			ps.setString(2, p);
			
			
		ResultSet rs= ps.executeQuery();
		if(rs.next()){
			
			
			HttpSession s=request.getSession(true);
			s.setAttribute("username",u);
			
			request.getRequestDispatcher("Account.jsp").forward(request, response);
			
			//response.sendRedirect("Account.jsp");
			
		}else{
			request.setAttribute("msg", "username and password not correct");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}


			
			
				}
				catch(Exception e){
					e.printStackTrace();
				}
	}

}
