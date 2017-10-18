package io.sudheer.designpatterns.creational.singleton;

public class SingletonExample {

	public static void main(String[] args) {

		Runtime runtimeInstance1 = Runtime.getRuntime();
		runtimeInstance1.gc();
		System.out.println(runtimeInstance1);
		
		Runtime runtimeInstance2 = Runtime.getRuntime();
		System.out.println(runtimeInstance2);
		runtimeInstance2.gc();
		
		if (runtimeInstance1 == runtimeInstance2) {
			System.out.println("Both are same");
		}
		
	}

}
