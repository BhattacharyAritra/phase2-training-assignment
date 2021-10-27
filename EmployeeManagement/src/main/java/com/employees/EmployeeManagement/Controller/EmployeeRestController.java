package com.employees.EmployeeManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employees.EmployeeManagement.Entity.EmployeeEntity;
import com.employees.EmployeeManagement.Service.EmployeeDatabaseService;

@RestController
@RequestMapping("/employees")
public class EmployeeRestController {

	@Autowired
	EmployeeDatabaseService employeeService;

	@GetMapping("/")
	public List<EmployeeEntity> listAllEmployees(){
		return employeeService.getAllEmployees();
	}

	@GetMapping("/{employeeId}")
	public ResponseEntity<EmployeeEntity> fetchById(@PathVariable Integer employeeId){
		EmployeeEntity employee = employeeService.getEmployeeById(employeeId);
		return new ResponseEntity<EmployeeEntity>(employee, HttpStatus.OK);
	}

	@PostMapping("/")
	public ResponseEntity<EmployeeEntity> addEmployee(@RequestBody EmployeeEntity employee) {
		EmployeeEntity newEmployee = employeeService.createEmployee(employee);
		return new ResponseEntity<EmployeeEntity>(newEmployee, HttpStatus.OK);
	}

	@PutMapping("/{employeeId}")
	public ResponseEntity<EmployeeEntity> updateById(@RequestBody EmployeeEntity employee, @PathVariable Integer employeeId){
		EmployeeEntity existingEmployee = employeeService.getEmployeeById(employeeId);

		existingEmployee.setEmployeeId(employee.getEmployeeId());
		existingEmployee.setEmployeeName(employee.getEmployeeName());
		existingEmployee.setEmployeeYears(employee.getEmployeeYears());
		existingEmployee.setRole(employee.getRole());

		EmployeeEntity updatedEmployee = employeeService.createEmployee(existingEmployee);
		return new ResponseEntity<EmployeeEntity>(updatedEmployee, HttpStatus.OK);
	}

	@DeleteMapping("/{employeeId}")
	public void eraseDetails(@PathVariable Integer employeeId) {
		employeeService.deleteEmployeeById(employeeId);
	}
}
