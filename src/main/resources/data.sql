DROP TABLE IF EXISTS employees;
DROP table IF EXISTS departments;


CREATE TABLE departments (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(100) DEFAULT NULL,
  budget int DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE employees (
  id varchar(8) NOT NULL,
  name varchar(100) DEFAULT NULL,
  surname varchar(255) DEFAULT NULL,
  department int(11) DEFAULT NULL,
  PRIMARY KEY (id),
  CONSTRAINT FK_depEmp FOREIGN KEY (department) REFERENCES departments (id)
  ON DELETE SET NULL ON UPDATE CASCADE
);


insert into departments (name, budget)values('D1', 23000);
insert into departments (name, budget)values('D2', 54000);
insert into departments (name, budget)values('D3', 14000);
insert into departments (name, budget)values('D4', 74000);

insert into employees (id, name, surname, department) values ('00000000', 'Rafa', 'Nadal', 1);
insert into employees (id, name, surname, department) values ('00000001', 'Fernando', 'Alonso', 4);
insert into employees (id, name, surname, department) values ('00000011', 'Carlos', 'Sainz', 3);
insert into employees (id, name, surname, department) values ('00000111', 'Andres', 'Iniesta', 2);

