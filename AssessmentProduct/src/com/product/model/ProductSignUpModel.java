package com.product.model;

import java.util.Date;

public class ProductSignUpModel {
	
	
	private int empId;
	private String empName;
	private String department;
	private Date dateOfJoining;
	private String userActive;
	private String password;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getUserActive() {
		return userActive;
	}
	public void setUserActive(String userActive) {
		this.userActive = userActive;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}


