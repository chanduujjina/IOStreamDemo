package com.demo.filehandle.ser;

import java.io.Serializable;

public class Student implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	private int id;
	
	private String name;
	
	private static double salary;
	
	private Address address;
	
	public static double getSalary() {
		return salary;
	}

	public static void setSalary(double salary) {
		Student.salary = salary;
	}

}
