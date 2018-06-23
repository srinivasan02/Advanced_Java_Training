package com.product.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.product.model.ProductSignUpModel;

/**
 * Servlet implementation class SignUpAdmin
 */
//@WebServlet("/SignUpAdmin")
public class SignUpAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try {
			 String employeeId = request.getParameter("empId");	
			 int empId = Integer.parseInt(employeeId);
			 String empName = request.getParameter("empName");
			 String department = request.getParameter("dept");
			 String doj = request.getParameter("doj");
			 
			 //String Cast To Date
			 DateFormat format = new SimpleDateFormat("MM/YYYY/dd");
			 Date doj1 = format.parse(doj);
			 String userActive = request.getParameter("userActive");
			 String password = request.getParameter("password");
			 
			 
			 //Setting the Values to the Model Variables
			 
			 ProductSignUpModel prodObj = new ProductSignUpModel();
			 prodObj.setEmpId(empId);
			 prodObj.setEmpName(empName);
			 prodObj.setDepartment(department);
			 prodObj.setDateOfJoining(doj1);
			 prodObj.setUserActive(userActive);
			 prodObj.setPassword(password);
			 
		
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
