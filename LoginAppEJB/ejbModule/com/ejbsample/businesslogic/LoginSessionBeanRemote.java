package com.ejbsample.businesslogic;

import javax.ejb.Remote;

@Remote
public interface LoginSessionBeanRemote {
	
	public void addUser(String uName, String pwd);
	public void removeUser();
	
	

}
