package com.corejava.operators;

public class Logical {

	static int a=20,b=30;
	 
	 public static void main(String[] args)
	 { 
	  ConditionOne conditionOne = new ConditionOne(); 
	  conditionOne.method();
	  conditionOne.methodOne();
	  conditionOne.methodTwo(); 
	  conditionOne.methodThree();
	  conditionOne.methodFour();
	  conditionOne.methodFive();  
	  method();
	  methodOne();
	  methodTwo();
	  methodThree();
		
	 }

	static void method()
	{
	if (a>b)
	System.out.println("a is big");
	if (b>a)
	System.out.println("b is big");	
		
		
	}

	static void methodOne()
	{
	if (a>b)
	System.out.println("a is big");
	else
	System.out.println("b is big");	
		
		
	}

	static void methodTwo()
	{
		int a=40,b=30;
	if (a>b)
	System.out.println("a is big");
	else
	System.out.println("b is big");	
		
		
	}

	static void methodThree()
	{
		int a=30,b=30;
	if (a>b)
	System.out.println("a is big");
	else if (b>a)
	System.out.println("b is big");	
	else 
	System.out.println("a & b are equal");
		
	}


	}