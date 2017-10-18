package io.sudheer.designpatterns.creational.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import io.sudheer.designpatterns.utils.Constants;

public class MySingletonDemo {

	public static void main(String[] args) {
		
		//nonThreadSafeRun();
		threadSafeRun();
		
	}
	
	private static void threadSafeRun() {
		MySingletonThreadSafe instance = MySingletonThreadSafe.getInstance();
		System.out.println(instance);
		
		long timeBefore = 0;
		long timeAfter = 0;
		
		timeBefore = System.currentTimeMillis();
		Connection con = instance.getConnection();
		timeAfter = System.currentTimeMillis();
		
		System.out.print("Time to really create an instance of Connection object = ");
		System.out.println(timeAfter - timeBefore);
		
		Statement stmt;
		try {
			stmt = con.createStatement();
			int count = stmt.executeUpdate(Constants.CREATE_ADDRESS_TABLE);
			System.out.println("Table Created.");
			stmt.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		timeBefore = System.currentTimeMillis();
		con = instance.getConnection();
		timeAfter = System.currentTimeMillis();
		
		System.out.print("Time to get literally the same instance of Connection object being singleton = ");
		System.out.println(timeAfter - timeBefore);
		
	}

	private static void nonThreadSafeRun() {
		MySingleton instance1 = MySingleton.getInstance();
		System.out.println(instance1);
		
		// MySingleton instance2 = new MySingleton(); // Doesn't work
		
		MySingleton instance2 = MySingleton.getInstance();
		System.out.println(instance2);
	}

}
