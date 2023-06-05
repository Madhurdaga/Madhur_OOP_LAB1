package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public String genrateUserEmail(String firstName, String lastName, String departmentName) {
		// TODO Auto-generated method stub
		return firstName + lastName + "@" + departmentName +".gl.com";
	}

	@Override
	public String genrateUserPassword() {
		String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String nums = "0123456789";
		String splchar = "!@#$%^&*()";
		String combined = caps + lower + nums + splchar ;
		System.out.println(combined.length()); //72
		String genpass = "";
		Random random = new Random();
		for(int i=1; i <=8; i++) {
		   genpass += String.valueOf(combined.charAt(random.nextInt(combined.length())));
		}
		return genpass;
	}

	@Override
	public void displayEmployeeDetails(Employee e1) {
		System.out.println("Employee First Name is : " +e1.getFirstName());
		System.out.println("Employee Last Name is : " +e1.getLastName());
		System.out.println("Employee Email ID is : " +e1.getUserEmail());
		System.out.println("Employee Password is : " +e1.getPassword());
		
	}
	
}
