package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Employee;
import com.example.demo.service.EmployeeServiceImpl;



@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl employeeServideImpl;
	
	@GetMapping("/employees")
	public List<Employee> listEmployees(){
		return employeeServideImpl.listEmployees();
	}
	
	@PostMapping("/employees")
	public Employee saveEmployees(@RequestBody Employee employee) {
		
		return employeeServideImpl.saveEmployee(employee);
	}
	
	@GetMapping("/employees/{id}")
	public Employee employeeByID(@PathVariable(name="id") String id) {
		
		Employee employee_xid= new Employee();
		
		employee_xid=employeeServideImpl.employeeByID(id);
		
		System.out.println("Employee XID: "+employee_xid);
		
		return employee_xid;
	}
	
	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@PathVariable(name="id")String id,@RequestBody Employee employee) {
		
		Employee employee_selected = new Employee();
		Employee employee_updated = new Employee();
		
		employee_selected= employeeServideImpl.employeeByID(id);
		
		employee_selected.setName(employee.getName());
		employee_selected.setSurname(employee.getSurname());
		employee_selected.setDepartment(employee.getDepartment());
		
		employee_updated = employeeServideImpl.updateEmployee(employee_selected);
		
		System.out.println("El employee actualizado es: " + employee_updated);
		
		return employee_updated;
	}
	
	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable(name="id")String id) {
		employeeServideImpl.deleteEmployee(id);
	}
	
}