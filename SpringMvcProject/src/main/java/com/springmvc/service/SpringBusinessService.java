package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.DaoConnection;
import com.springmvc.dao.SpringMvcDao;
import com.springmvc.model.SpringMvcModel;

@Service
public class SpringBusinessService {
	
	@Autowired
	DaoConnection dao;

	public void display(SpringMvcModel user)
	{
		System.out.println("********Entered into Business Layer************");
		if(user.getPassword().length() >= 6)
		{
			int update = dao.updateQuery(user);
			System.out.println("Date Updated Succesfully..."+update);
		}
		else
		{
			System.out.println("Password should be more than 6 characters");
		}
	}
}
