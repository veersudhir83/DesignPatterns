package io.sudheer.designpatterns.structural.adapter;

import java.util.List;

public class EmployeeDemo {

	public static void main(String[] args) {

		EmployeeClient client = new EmployeeClient();
		List<Employee> empsFromDB = client.getEmployeeList();
		System.out.println(empsFromDB);
	}

}
