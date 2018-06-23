package com.Practice.bookFlight.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
			
			System.out.println("########################");
			
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
	
	
	public List<Object> fetchingData()
	{

		Connection conn = null;
		Statement stmt=null;		
		List<Object> rows = new ArrayList<Object>();
		
		try {			
			
			//Registering the Driver
			 Class.forName(JDBC_DRIVER);
			
			//Establishing or getting the connection
			  conn = DriverManager.getConnection(URL, UserName, Password);
			 
			//Creating the Statement
			 stmt = conn.createStatement();
			 
			//Writing the Query by using the Statement
			 String query = "SELECT * FROM sample";
			 
			// Adding the values to the Result Set
			 
			 ResultSet rs =stmt.executeQuery(query);
			 
			/* ResultSetMetaData md = rs.getMetaData();
			    int columns = md.getColumnCount();
			    
			    while (rs.next()){
			        Map<String, Object> row = new HashMap<String, Object>(columns);
			        for(int i = 1; i <= columns; ++i){
			            row.put(md.getColumnName(i), rs.getObject(i));
			        }
			        rows.add(row);
			        System.out.println("********Map values are***************:"+rows);
			    }*/
			 
			 
			 while (rs.next())
			 {
				 	BookFlightModelClass bookFlightModelClass=new BookFlightModelClass();
			    	bookFlightModelClass.setAircraftName(rs.getString("AircraftName"));
			    	bookFlightModelClass.setDestination(rs.getString("Destination"));
			    	Double fare = Double.parseDouble(rs.getString("fare"));
			    	bookFlightModelClass.setFare(fare);
			    	bookFlightModelClass.setFlightName(rs.getString("FlightName"));
			    	int noofseats = Integer.parseInt(rs.getString("NoofSeats"));
			    	bookFlightModelClass.setNoofseats(noofseats);
			    	bookFlightModelClass.setSource(rs.getString("Source"));
			    	rows.add(bookFlightModelClass);
			 }
			
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
		return rows;
	}
	
	
}
