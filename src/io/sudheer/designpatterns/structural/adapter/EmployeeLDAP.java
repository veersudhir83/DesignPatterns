package io.sudheer.designpatterns.structural.adapter;

public class EmployeeLDAP {
	
	private int cn;
	private String givenname;
	private String surname;
	private String mail;

	public EmployeeLDAP(int cn, String givenname, String surname, String mail) {
		this.cn = cn;
		this.givenname = givenname;
		this.surname = surname;
		this.mail = mail;
	}

	public int getCn() {
		return cn;
	}
	public String getGivenname() {
		return givenname;
	}
	public String getMail() {
		return mail;
	}
	
	public String getSurname() {
		return surname;
	}
	
	

}
