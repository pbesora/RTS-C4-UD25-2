package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Department;

public interface IDepartmentService {

	//Metodos del CRUD
		public List<Department> listDepartments(); //Listar All 
		
		public Department saveDepartment(Department department);	//Guarda un cliente CREATE
		
		public Department departmentByID(Long id); //Leer datos de un cliente READ
		
		public Department updateDepartment(Department department); //Actualiza datos del cliente UPDATE
		
		public void deleteDepartment(Long id);// Elimina el cliente DELETE
}
