package com.corejava;

public class ExecutableClass {

	public static void main(String[] args) {
		
	// Creating an object of the NormalClass
	 NormalClass normalClass = new NormalClass(66,"Hello");

	        // Accessing methods from NormalClass
	        System.out.println(normalClass.getMyNumber());
	        System.out.println(normalClass.getMyString());

	}

}
