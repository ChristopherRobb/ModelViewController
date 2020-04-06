package com.robbchris.servlet;

public class Guest {
	
	private String firstName;
	private String lastName;
	private String email;
	
	
	
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFname(String firstName) {
		this.firstName = firstName;
	}
	
	
	
	
	public String getLastName() {
		return lastName;
	}
	public void setLname(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	public Guest(String fname, String lname, String email) {
		super();
		this.firstName = fname;
		this.lastName = lname;
		this.email = email;
	}
	
	
	
	
	
	
	
	
	
	

}
