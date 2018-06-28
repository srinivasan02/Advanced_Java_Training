package com.springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springmvc.model.SpringMvcModel;

@Repository
public class DaoConnection 
{
	@Autowired
	 private JdbcTemplate jdbcTemplateObject;
	
	 public int updateQuery(SpringMvcModel user)
	 {
		 System.out.println("********Entered into Database Layer**********");
		 int update=0;
		 String query ="INSERT INTO userDetails(UserName,Password)VALUES(?,?)";
		 update = jdbcTemplateObject.update(query,user.getUsername(),user.getPassword());
		 return update;
	 }
}
