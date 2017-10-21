package io.sudheer.designpatterns.structural.adapter;

public class EmployeeDB implements Employee {
	
	private int ID;
	private String firstName;
	private String lastName;
	private String email;
	
	public EmployeeDB(int ID, String firstName, String lastName, String email) {
		this.ID = ID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
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
	
	public String toString() {
		return "ID: " + this.getID() + ", FirstName: " + this.getFirstName() + ", LastName: " + this.getLastName() + ", Email: " + this.getEmail();
	}

}
