package com.naim.fullstack.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naim.fullstack.entity.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// that's it ... no need to write any code LOL!
	
}
