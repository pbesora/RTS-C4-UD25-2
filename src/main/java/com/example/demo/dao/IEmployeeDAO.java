package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Employee;


public interface IEmployeeDAO extends JpaRepository<Employee, String>{

}
