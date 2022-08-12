package com.createiq.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.createiq.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	 List<Employee> list=Arrays.asList(new Employee(101, "Octavia",25000.00),new Employee(102, "Johan",25000.00),new Employee(103, "Marphy",35000.00));
	
	@Override
	public List<Employee> findAll() {
		
		return list;
	}

	@Override
	public Employee findById(Integer eid) {
		
		return list.stream().filter(k->k.getEid().equals(eid)).findFirst().get();
	}

	

}
