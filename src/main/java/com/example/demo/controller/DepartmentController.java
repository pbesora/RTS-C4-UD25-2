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

import com.example.demo.dto.Department;
import com.example.demo.service.DepartmentServiceImpl;


@RestController
@RequestMapping("/api")
public class DepartmentController {
	
	@Autowired
	DepartmentServiceImpl departmentServiceImpl;
	
	@GetMapping("/departments")
	public List<Department> listDepartments(){
		return departmentServiceImpl.listDepartments();
	}
	
	@PostMapping("/departments")
	public Department saveDepartment(@RequestBody Department department) {
		
		return departmentServiceImpl.saveDepartment(department);
	}
	
	@GetMapping("/departments/{id}")
	public Department departmentByID(@PathVariable(name="id") Long id) {
		
		Department department_byid= new Department();
		
		department_byid = departmentServiceImpl.departmentByID(id);
		
		System.out.println("Department by ID: " + department_byid);
		
		return department_byid;
	}
	
	@PutMapping("/departments/{id}")
	public Department updateDepartment(@PathVariable(name="id")Long id,@RequestBody Department department) {
		
		Department department_selected= new Department();
		Department department_updated= new Department();
		
		department_selected= departmentServiceImpl.departmentByID(id);
		
		department_selected.setName(department.getName());
		department_selected.setBudget(department.getBudget());
		
		department_updated = departmentServiceImpl.updateDepartment(department_selected);
		
		System.out.println("El department updated es: "+ department_updated);
		
		return department_updated;
	}
	
	@DeleteMapping("/departments/{id}")
	public void deleteDepartment(@PathVariable(name="id")Long id) {
		departmentServiceImpl.deleteDepartment(id);
	}
	
	
}