package io.sudheer.designpatterns.structural.adapter;

import java.util.StringTokenizer;

public class EmployeeCSV {
	private int ID;
	private String firstName;
	private String lastName;
	private String email;
	
	public EmployeeCSV(String values) {
		StringTokenizer tokenizer = new StringTokenizer(values, ",");
		if(tokenizer.hasMoreTokens()) {
			this.ID = Integer.parseInt(tokenizer.nextToken());
		}
		if(tokenizer.hasMoreTokens()) {
			this.firstName = tokenizer.nextToken();
		}
		if(tokenizer.hasMoreTokens()) {
			this.lastName = tokenizer.nextToken();
		}
		if(tokenizer.hasMoreTokens()) {
			this.email = tokenizer.nextToken();
		}
	}
	
	public String getEmail() {
		return email;
	}
	public String getFirstName() {
		return firstName;
	}
	public int getID() {
		return ID;
	}
	public String getLastName() {
		return lastName;
	} 
	
}
