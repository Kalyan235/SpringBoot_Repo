package com.createiq.service;

import java.util.List;

import com.createiq.model.Employee;

public interface EmployeeService {
	
	 List<Employee> findAll();
	
	 Employee findById(Integer eid);

}
