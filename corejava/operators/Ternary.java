package com.corejava.operators;

public class Ternary {

	public static void main(String[] args) {

		int a=24,b=56;  
		 greet(a,b);
		 greet1(a,b);
	  }
	 static void greet(int a ,int b)
	 {
		String c=(a>b)?"a is big":"b is big"; 
		System.out.println(c); 
	 }

	 static void greet1(int a ,int b)
	 {
		String c=(a>b)?(a==b)?"both equal":"a is big":(b>a)?"b is big":"a is big"; 
		System.out.println(c); 

	 }


}
