package com.exampled.demo.service;

import java.util.List;

import com.exampled.demo.model.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);

	public List<Employee> getAllEmployees();

	public Employee getById(Integer id);

	public Employee updateEmployee(Employee employee, Integer id);

	public void deleteEmployee(Integer id);

}
