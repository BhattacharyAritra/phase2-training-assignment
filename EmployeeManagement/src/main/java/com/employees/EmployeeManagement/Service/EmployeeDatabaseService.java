package com.employees.EmployeeManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employees.EmployeeManagement.Entity.EmployeeEntity;
import com.employees.EmployeeManagement.Repository.EmployeeRepository;

@Service
public class EmployeeDatabaseService {

	@Autowired
	private EmployeeRepository employeeRepository;

	//	Returns List of all employees
	public List<EmployeeEntity> getAllEmployees(){
		return employeeRepository.findAll();
	}

	//	Returns employee by particular id
	public EmployeeEntity getEmployeeById(Integer employeeId){
		return employeeRepository.findById(employeeId).get();
	}

	//	Create employee record in database
	public EmployeeEntity createEmployee(EmployeeEntity employee) {
		return employeeRepository.save(employee);
	}

	//	Remove record by employee id
	public void deleteEmployeeById(Integer employeeId) {
		employeeRepository.deleteById(employeeId);
	}
}
