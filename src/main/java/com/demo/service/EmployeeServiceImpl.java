package com.demo.service;

import java.util.List;

import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	EmployeeDao employeeDao = new EmployeeDaoImpl();
	
	@Override
	public void save(Employee e) {
		employeeDao.save(e);	
	}

	@Override
	public List<Employee> fetchEmployees() {
		return employeeDao.retrieveEmployees();
		
	}

}
