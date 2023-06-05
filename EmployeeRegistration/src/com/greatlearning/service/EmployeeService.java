package com.greatlearning.service;

import com.greatlearning.model.Employee;

public interface EmployeeService {
	String genrateUserEmail(String firstName, String lastName, String departmentName);
	String genrateUserPassword();
	void displayEmployeeDetails(Employee e1);

}
