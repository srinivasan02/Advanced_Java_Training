package com.Practice.FlightBooking.Controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Practice.BookFlightServlet.Model.BookFlightModelClass;
import com.Practice.FlightBooking.Service.BookFlightBusinessLogic;
import com.Practice.bookFlight.DAO.FlightDAODetails;


@WebServlet("/BookFlight")
public class BookFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public BookFlight() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		FlightDAODetails dao = new FlightDAODetails();
		//List<Map<String, Object> rows  = dao.fetchingData();
		List<Object> rows  = dao.fetchingData();
		request.setAttribute("data",rows);
		RequestDispatcher redirectpage = request.getRequestDispatcher("Success.jsp");
		redirectpage.forward(request,response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String flightName1=request.getParameter("flightName");
		String source1=request.getParameter("src");
		String destination1=request.getParameter("dst");
		String fare1=request.getParameter("fare");
		double farecast = Double.parseDouble(fare1);
		String noofseats1=request.getParameter("noofseats");
		int noofseats= Integer.parseInt(noofseats1);
		String aircraftName1=request.getParameter("aircraftName");
	
		//Adding the Parameters to the model class object
		
		BookFlightModelClass book = new BookFlightModelClass();
		book.setFlightName(flightName1);
		book.setSource(source1);
		book.setDestination(destination1);
		book.setFare(farecast);
		book.setNoofseats(noofseats);
		book.setAircraftName(aircraftName1);
		
		//Adding the Business Logic Class
		BookFlightBusinessLogic bookBusLogic  = new BookFlightBusinessLogic();
		boolean boo = bookBusLogic.flightBooking(book);
		System.out.println(bookBusLogic);
		
		if(boo)
		{
			System.out.println("hello......");
			//Redirecting to JSP page by calling Request Dispatcher
			
			RequestDispatcher redirectpage = request.getRequestDispatcher("LoginResponse.jsp");
			redirectpage.forward(request, response);
		}else
		{
			response.sendRedirect("https://www.makemytrip.com/");
		}
		
		
		
		
	}

}
