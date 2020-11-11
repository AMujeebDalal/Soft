package models;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Dbconnections.Connect;

public class AppLogic {

	
	
	public static int insertData(InsertData d){
		int i=0;
		try{	
			
			
	Connection con=	Connect.getDbInstance();
		
	PreparedStatement ps=con.prepareStatement("insert into users(FirstName,LastName,DOB,username,password,email) values(?,?,?,?,?,?)");
	ps.setString(1,d.getFirstName());
	ps.setString(2,d.getLastName());
	ps.setString(3,d.getDOB());
	ps.setString(4,d.getUsername());
	ps.setString(5,d.getPassword());
	ps.setString(6,d.getEmail());
	
	
i=	ps.executeUpdate();
	
	}
	catch(Exception e){
		e.printStackTrace();
	}		
		return i;
	}
	
	
	
	
}
