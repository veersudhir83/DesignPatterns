package io.sudheer.designpatterns.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import io.sudheer.designpatterns.utils.Constants;

public class MySingletonThreadSafe {

	// Eager Loading - created as soon as class is loaded into JVM
	//private static MySingletonThreadSafe instance = MySingletonThreadSafe();
	
	// Lazy Loading - singleton instance created only when required
	private static MySingletonThreadSafe instance = null;
	
	private Connection con = null;
	
	private MySingletonThreadSafe() {
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static MySingletonThreadSafe getInstance() {
		
		// Lazy Loading - singleton instance created only when required
		if (instance == null) {
			synchronized (MySingletonThreadSafe.class) {
				instance = new MySingletonThreadSafe();
			}
		}
		
		return instance;
	}

	public Connection getConnection() {
		if (con == null) {
			synchronized (MySingletonThreadSafe.class) {
				if (con == null) {
					try {
						String jdbcUrl = Constants.DERBY_JDBC_URL;
						con = DriverManager.getConnection(jdbcUrl);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return con;
	}
	
}
