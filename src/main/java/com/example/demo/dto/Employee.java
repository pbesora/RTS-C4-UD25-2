package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="employees")//en caso que la tabla sea diferente

public class Employee {
	
	//Atributos de entidad cliente
		@Id
		private String id;
		@Column(name = "name")//no hace falta si se llama igual
		private String name;
		@Column(name = "surname")//no hace falta si se llama igual
		private String surname;
		
		@ManyToOne
	    @JoinColumn(name="department")
	    private Department department;

		//Constructores
		/**
		 * 
		 */
		public Employee() {
			
		}

		/**
		 * @param dni
		 * @param name
		 * @param surname
		 * @param department
		 */
		public Employee(String id, String name, String surname, Department department) {
			this.id = id;
			this.name = name;
			this.surname = surname;
			this.department = department;
		}

		

		/**
		 * @return the id
		 */
		public String getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(String id) {
			this.id = id;
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the surname
		 */
		public String getSurname() {
			return surname;
		}

		/**
		 * @param surname the surname to set
		 */
		public void setSurname(String surname) {
			this.surname = surname;
		}

		/**
		 * @return the department
		 */
		public Department getDepartment() {
			return department;
		}

		/**
		 * @param department the department to set
		 */
		public void setDepartment(Department department) {
			this.department = department;
		}

		@Override
		public String toString() {
			return "Employee [dni=" + id + ", name=" + name + ", surname=" + surname + ", department=" + department
					+ "]";
		}
}