package com.createiq.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.createiq.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Employee> findAll() {

		return jdbcTemplate.query("SELECT * FROM EMPLOYEE", new BeanPropertyRowMapper<Employee>(Employee.class));
	}

	@Override
	public Employee findById(Integer eid) {

		return jdbcTemplate.queryForObject("SELECT * FROM EMPLOYEE WHERE EID= ?",
				new BeanPropertyRowMapper<Employee>(Employee.class), eid);
	}

	@Override
	public Integer save(Employee employee) {

		return jdbcTemplate.update("insert into employee values (?,?,?)",
				new Object[] { employee.geteId(), employee.geteName(), employee.geteSalary() });
	}

	/**
	 *
	 */
	@Override
	public Integer update(Employee employee) {

		return jdbcTemplate.update("UPDATE EMPLOYEE SET ENAME= ? ,ESALARY= ? WHERE EID= ?",
				new Object[] { employee.geteName(), employee.geteSalary(), employee.geteId() });
	}

	@Override
	public Integer deleteById(Integer eid) {

		return jdbcTemplate.update("DELETE FROM EMPLOYEE WHERE EID= ?", new Object[] { eid });
	}

}
