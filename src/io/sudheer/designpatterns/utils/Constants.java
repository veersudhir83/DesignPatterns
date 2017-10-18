package io.sudheer.designpatterns.utils;

public class Constants {

	public static String DERBY_JDBC_URL = "jdbc:derby:memory:codejava/webdb;create=true";
	
	public static String CREATE_ADDRESS_TABLE = "CREATE TABLE ADDRESS "
			+ " ( ID INT, "
			+ "   STREET_NAME VARCHAR(20),"
			+ "   CITY VARCHAR(20)"
			+ " )";
}
