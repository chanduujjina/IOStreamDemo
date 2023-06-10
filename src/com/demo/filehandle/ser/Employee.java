package com.demo.filehandle.ser;

import java.io.Serializable;

public class Employee extends BaseDetail {
	
	@Override
	public String toString() {
		return "Employee [deptName=" + deptName + ", employeeType=" + employeeType + "]";
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public Employee(int id, String name, String gender, String deptName, String employeeType) {
		super(id, name, gender);
		this.deptName = deptName;
		this.employeeType = employeeType;
	}

	private String deptName;
	
	private String employeeType;
	
}
