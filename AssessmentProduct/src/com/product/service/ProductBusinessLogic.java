package com.product.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.product.model.ProductSignUpModel;



public class ProductBusinessLogic 
{
	public boolean flag;
		
		public boolean dojValidate(ProductSignUpModel prodObj)
		{
			//Getting 
			DateFormat dateFormat = new SimpleDateFormat("MM/YYYY/dd");
			Date date = new Date();
			Date compareDate = prodObj.getDateOfJoining();
			
			if(date.after(compareDate) && date.equals(compareDate))
			{
				
			}
			else
			{
				System.out.println("Hello");
			}
			return flag;
		}
}
