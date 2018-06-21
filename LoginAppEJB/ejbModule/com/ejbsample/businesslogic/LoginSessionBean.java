package com.ejbsample.businesslogic;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class LoginSessionBean
 */
@Stateful  
public class LoginSessionBean implements LoginSessionBeanRemote {

    /**
     * Default constructor. 
     */
    public LoginSessionBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addUser(String uName, String pwd) {
		System.out.println("User Name is :"+uName);
		System.out.println("Password is :"+pwd);
	}

	@Override
	public void removeUser() {
		System.out.println("Removed User Method");
		
	}

}
