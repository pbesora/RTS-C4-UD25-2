package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Employee;


public interface IEmployeeService {
	//Metodos del CRUD
			public List<Employee> listEmployees(); //Listar All 
			
			public Employee saveEmployee(Employee employee);	//Guarda un video CREATE
			
			public Employee employeeByID(String id); //Leer datos de un video READ
			
			public Employee updateEmployee(Employee employee); //Actualiza datos del video UPDATE
			
			public void deleteEmployee(String id);// Elimina el video DELETE

			
}
