package com.createiq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.createiq.model.Employee;
import com.createiq.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/hit")
	public String sayHello() {
		
		return "Hi mama";
	}
	@GetMapping("/findAll")
	public List<Employee> findAll(){
		
		return employeeService.findAll();
		
	}
	@GetMapping("/findAll/{eid}")
	public Employee findById(@PathVariable Integer eid) {
		return employeeService.findById(eid);
		
	}

}
