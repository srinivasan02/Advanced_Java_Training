package com.Practice.bookFlight.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.Practice.BookFlightServlet.Model.BookFlightModelClass;

public class FlightDAODetails 
{
	private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String URL="jdbc:mysql://localhost:3306/my_db";
	
	//Database Credentials
	
	static final String UserName="root123";
	private static final String Password = "root123";
	
	public int addFlightDB(BookFlightModelClass book)
	{
		Connection conn = null;
		Statement stmt=null;
		int update=0;
		
		try {
			
			
			//Registering the Driver
			 Class.forName(JDBC_DRIVER);
			
			//Establishing or getting the connection
			  conn = DriverManager.getConnection(URL, UserName, Password);
			 
			//Creating the Statement
			 stmt = conn.createStatement();
			 
			//Writing the Query by using the Statement
			 String query = "INSERT INTO sample(FlightName,Source,Destination,Fare,NoofSeats,AircraftName)"
			 		+ "VALUES ('"+book.getFlightName()+"','"+book.getSource()+"','"+book.getDestination()+"',"+book.getFare()+","+book.getNoofseats()+",'"
			 		+book.getAircraftName()+"')";
			 //System.out.println("#########"+query);
			 //Executing the Query by using execute query method 
			  update = stmt.executeUpdate(query);
			 System.out.println("Sucessfully Inserted!!!!!!!!!!!!!!");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(stmt!=null)
					stmt.close();
				if(conn!=null)
					conn.close();
			}catch(Exception e)
			{
				
			}
			
		}
		return update;
	}
	
	
}
