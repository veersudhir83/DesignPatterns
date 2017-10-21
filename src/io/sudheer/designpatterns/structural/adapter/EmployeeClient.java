package io.sudheer.designpatterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public List<Employee> getEmployeeList() {
		
		List<Employee> employeeList = new ArrayList<Employee>();
		Employee employeeFromDB = new EmployeeDB(1, "sudheer", "veeravalli", "veersudhir83@gmail.com");
		employeeList.add(employeeFromDB);
		
		// This one wont work because we need an adapter to map id to cn, firstName to givenname etc..
		//Employee employeeFromLDAP = new EmployeeLDAP(1, "sudheer", "veeravalli", "veersudhir83@live.com");
		EmployeeLDAP employeeFromLDAP = new EmployeeLDAP(1, "sudheer", "veeravalli", "veersudhir83@live.com");
		employeeList.add(new EmployeeAdapterLDAP(employeeFromLDAP));
		
		EmployeeCSV employeeFromCSV = new EmployeeCSV("1,sudheer,veeravalli,veersudhir83@gmail.com");
		employeeList.add(new EmployeeAdapterCSV(employeeFromCSV));
		
		return employeeList;
	}

}
