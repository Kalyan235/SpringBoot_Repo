package com.createiq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.createiq.dao.EmployeeDao;
import com.createiq.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public List<Employee> findAll() {

		return employeeDao.findAll();
	}

	@Override
	public Employee findById(Integer eid) {

		return employeeDao.findById(eid);
	}

	@Override
	public Integer save(Employee employee) {

		return employeeDao.save(employee);
	}

	@Override
	public Integer update(Employee employee) {

		return employeeDao.update(employee);
	}

	@Override
	public Integer deleteById(Integer eid) {

		return employeeDao.deleteById(eid);
	}

}
