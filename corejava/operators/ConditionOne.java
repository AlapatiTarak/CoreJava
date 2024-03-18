package com.corejava.operators;

public class ConditionOne {
	 void method()
	 {
	 	int a=20,b=30;
	 if (a<b && b>a)
	 System.out.println(" b is big");
	 if (a>b && b>a)
	 System.out.println(" a is big");
	 	
	 	
	 }

	  void methodOne()
	 {
	 	int a=45,b=15;
	 if (a<b || b>a)
	 System.out.println(" b is big");
	 if (a>b || b>a)
	 System.out.println(" One condition is true ");
	 	
	 	
	 }

	  void methodTwo()
	 {
	 	int a=20,b=30;
	 if (a<b && b==a)
	 System.out.println(" b is big");
	 else 
	 System.out.println(" both are true ");
	 	
	 	
	 }

	  void methodThree()
	 {
	 	int a=45,b=15;
	 if (a<b || b>a)
	 System.out.println(" b is big");
	 else
	 System.out.println(" a is big");
	 	
	 	
	 }

	  void methodFour()
	 {
	 	int a=20,b=30;
	 if (a>b && b==a)
	 System.out.println(" a is big");
	 else if(a<b && b>a && a==b)
	 System.out.println(" All conditions true ");
	 else 
	 System.out.println(" b is big");	
	 	
	 }

	  void methodFive()
	 {
	 	int a=55,b=37;
	 if (a<b || b==a)
	 System.out.println(" b is big");
	 else if(a<b || b<a || b>a || a==b)
	 System.out.println("One condition is true");
	 else
	 System.out.println("All are False");	
	 }



}
