package io.sudheer.designpatterns.structural.adapter;

import java.util.Arrays;
import java.util.List;

public class AdapterExample {

	public static void main(String[] args) {
		
		Integer[] arrayOfInts = new Integer[] {12, 14, 68};
		List<Integer> listOfInts = Arrays.asList(arrayOfInts);
		System.out.println(arrayOfInts);
		System.out.println(listOfInts);
	}

}
