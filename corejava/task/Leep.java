package com.corejava.task;

public class Leep {

	public static void main(String[] y) {
		int a=Integer.parseInt(y[0]);
		   
		   if ((a%4==0 & a%100!=0)||(a%400==0))
		   System.out.println("Given year is leap year");
		   else 
		   System.out.println("Given year is not a leap year");
		   	   
		  }
}
