package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEmployeeDAO;
import com.example.demo.dto.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	IEmployeeDAO iEmployeeDAO;
	
	@Override
	public List<Employee> listEmployees() {
		
		return iEmployeeDAO.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		
		return iEmployeeDAO.save(employee);
	}

	@Override
	public Employee employeeByID(String id) {
	
		return iEmployeeDAO.findById(id).get();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		return iEmployeeDAO.save(employee);
	}

	@Override
	public void deleteEmployee(String id) {
		
		iEmployeeDAO.deleteById(id);
	}

}
