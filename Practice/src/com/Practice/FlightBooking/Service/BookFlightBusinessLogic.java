package com.Practice.FlightBooking.Service;
import com.Practice.BookFlightServlet.Model.BookFlightModelClass;
import com.Practice.bookFlight.DAO.FlightDAODetails;

public class BookFlightBusinessLogic 

{
	public boolean flag;
	
	public boolean flightBooking(BookFlightModelClass book)
	{
		if(book.getAircraftName().equals("Boeing"))
		{
			FlightDAODetails dao = new FlightDAODetails();
			int update = dao.addFlightDB(book);
			
			if(update>0)
			{
				flag=true;
			}else
			{
				
			}
			
		}
		else
		{
			System.out.println("Hello");
		}
		return flag;
	}

}
