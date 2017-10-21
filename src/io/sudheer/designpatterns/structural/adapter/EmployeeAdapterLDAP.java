package io.sudheer.designpatterns.structural.adapter;

public class EmployeeAdapterLDAP implements Employee {

	private EmployeeLDAP instance;
	
	public EmployeeAdapterLDAP(EmployeeLDAP instance) {
		this.instance = instance;
	}
	
	@Override
	public int getID() {
		return instance.getCn();
	}

	@Override
	public String getFirstName() {
		return instance.getGivenname();
	}

	@Override
	public String getLastName() {
		return instance.getSurname();
	}

	@Override
	public String getEmail() {
		return instance.getMail();
	}
	
	public String toString() {
		return "ID: " + this.getID() + ", FirstName: " + this.getFirstName() + ", LastName: " + this.getLastName() + ", Email: " + this.getEmail();
	}

}
