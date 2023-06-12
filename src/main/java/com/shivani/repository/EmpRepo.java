package com.shivani.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivani.model.Employee;

public interface EmpRepo extends JpaRepository<Employee, Long> {

}
