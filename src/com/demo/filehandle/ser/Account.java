package com.demo.filehandle.ser;

import java.io.Serializable;

public class Account implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7234023963005953205L;

	@Override
	public String toString() {
		return "Account [accountHolderName=" + accountHolderName + ", accountType=" + accountType + ", accountNumber="
				+ accountNumber + ", ifscCode=" + ifscCode + "]";
	}

	public Account(String accountHolderName, String accountType, String accountNumber, String ifscCode) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	private String accountHolderName;
	
	private String accountType;
	
	private transient String accountNumber;
	
	private String ifscCode;
}
