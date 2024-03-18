package com.corejava.variable;

public class VariableClass {
	//global variable
	static int a= 10;                   
	public static void main(String[] args) {
		      //local variables
		    double b = 3.14; 
	        char c= 'A';           
	        boolean d = true;            
	        String e;               
	       e = "Hello, Java!";

	       
	        System.out.println(b);
	        System.out.println(c);
	        System.out.println(d);
	        System.out.println(e);
	        method();
	    }

	static int method() {
		System.out.println(a);
		return a;

	}

}
