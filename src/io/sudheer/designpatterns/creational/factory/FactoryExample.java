package io.sudheer.designpatterns.creational.factory;

import java.util.Calendar;
import java.util.TimeZone;

public class FactoryExample {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
	}

}
