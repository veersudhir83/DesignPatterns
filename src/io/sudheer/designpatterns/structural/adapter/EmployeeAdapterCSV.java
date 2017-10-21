package io.sudheer.designpatterns.structural.adapter;

public class EmployeeAdapterCSV implements Employee {

	private EmployeeCSV instance;
	
	public EmployeeAdapterCSV(EmployeeCSV instance) {
		this.instance = instance;
	}
	
	@Override
	public int getID() {
		return instance.getID();
	}

	@Override
	public String getFirstName() {
		return instance.getFirstName();
	}

	@Override
	public String getLastName() {
		return instance.getLastName();
	}

	@Override
	public String getEmail() {
		return instance.getEmail();
	}
	
	public String toString() {
		return "ID: " + this.getID() + ", FirstName: " + this.getFirstName() + ", LastName: " + this.getLastName() + ", Email: " + this.getEmail();
	}

}
