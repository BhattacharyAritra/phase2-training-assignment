package com.employees.EmployeeManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employees.EmployeeManagement.Entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer>{

}
