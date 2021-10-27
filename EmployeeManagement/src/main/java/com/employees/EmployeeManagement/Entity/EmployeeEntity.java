package com.employees.EmployeeManagement.Entity;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employeetable")
public class EmployeeEntity {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer employeeId;
	private String employeeName;
	private String role;
	private int employeeYears;
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeEntity(Integer employeeId, String employeeName, String role, int employeeYears) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.role = role;
		this.employeeYears = employeeYears;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getEmployeeYears() {
		return employeeYears;
	}
	public void setEmployeeYears(int employeeYears) {
		this.employeeYears = employeeYears;
	}
	
}
