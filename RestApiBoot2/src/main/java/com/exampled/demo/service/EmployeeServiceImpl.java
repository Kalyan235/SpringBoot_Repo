package com.exampled.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exampled.demo.exception.ResourceNotFoundException;
import com.exampled.demo.model.Employee;
import com.exampled.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
//
//	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
//		super();
//		this.employeeRepository = employeeRepository;
//	}

	@Override
	public Employee saveEmployee(Employee employee) {

		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {

		return employeeRepository.findAll();
	}

	@Override
	public Employee getById(Integer id) {

		// This is one Approach.
//		Optional<Employee> employee = employeeRepository.findById(id);
//		if (employee.isPresent()) {
//			return employee.get();
//		} else {
//			throw new ResourceNotFoundException("Employee", "Id", id);
//		}

		// 2nd Approach with java8
		return employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", id));
	}

	@Override
	public Employee updateEmployee(Employee employee, Integer id) {

		// We need check weather employee with given id is exist in DB or Not.
		Employee existingEmployee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", id));
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmail(employee.getEmail());
		// Save existing employee to DB.
		employeeRepository.save(existingEmployee);
		return existingEmployee;

	}

	@Override
	public void deleteEmployee(Integer id) {
		
		employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee", "Id", id));
		employeeRepository.deleteById(id);

	}

}
