package com.demo.filehandle.ser;

import java.io.Serializable;

public class Address implements Serializable{
	
	@Override
	public String toString() {
		return "Address [addId=" + addId + ", addType=" + addType + "]";
	}

	public int getAddId() {
		return addId;
	}

	public void setAddId(int addId) {
		this.addId = addId;
	}

	public String getAddType() {
		return addType;
	}

	public void setAddType(String addType) {
		this.addType = addType;
	}

	public Address(int addId, String addType) {
		super();
		this.addId = addId;
		this.addType = addType;
	}

	private int addId;
	
	private String addType;

}
