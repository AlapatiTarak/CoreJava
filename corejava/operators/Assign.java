package com.corejava.operators;

public class Assign {
	int a=10;
	int b=55;

	int method()
	{
	 a+=b;
	 System.out.println("a+=b ");
	 return a;
		
		
	}
	int methodOne()
	{
	 a-=b;
	 System.out.println("a -= b ");
	 return a;
		
		
	}
	int methodTwo()
	{
	 a*=b;
	 System.out.println("a *=b ");
	 return a;
		
		
	}
	int methodThree()
	{
	 a/=b;
	 System.out.println("a /=b ");
	 return a;
		
		
	}
	int methodFour()
	{
	 a%=b;
	 System.out.println("a%=b ");
	 return a;
	}	

}
