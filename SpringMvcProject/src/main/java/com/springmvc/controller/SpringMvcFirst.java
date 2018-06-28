package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.model.SpringMvcModel;
import com.springmvc.service.SpringBusinessService;

@Controller
//@RequestMapping("/dispServlet")
public class SpringMvcFirst {
	
	@Autowired 
	SpringBusinessService business;
	
	@RequestMapping(value="/")
	 public String validate(Model model)
	 {
		model.addAttribute("SpringMvcModel", new SpringMvcModel()); 
		System.out.println("************************");
		 return "Register";
	 }
	
/*	
	public String validate()
	{
		System.out.println("************************");
		 return "Register";
	}*/
	
	@RequestMapping(value="/registerProcess")
	public void submit(@ModelAttribute("SpringMvcModel") SpringMvcModel user)
		{
			user.getUsername();
			user.getPassword();
			business.display(user);
		}
}
