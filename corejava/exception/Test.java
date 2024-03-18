package com.corejava.exception;

public class Test {

	public static void main(String[] args) 
	{	
		main();
		mainOne();
		mainTwo();
	}

	static void main()
	{
	  System.out.println("Execution start");
	  int a=8,b=0;
	  int result=0;
	  
	  
	  try 
	  {
	    result=a/b;
	  }
	  
	  catch(ArithmeticException ad)
	  {
		  System.out.println(ad);
	  }
	  
	  System.out.println("Output::"+result);
	  System.out.println("Execution end");
	}
	
	
	static void mainOne()
	{
	  System.out.println("Execution start");
	  int a=4,b=0;
	  int result=0;
	  
	  
	  try 
	  {
		  int[] s=new int[1];
	    result=s[9];
	  }
	  
	  catch(ArithmeticException ad)
	  {
		  System.out.println("Can't divided by zero");
	  }
	  
	  catch(Exception ad)
	  {
		  System.out.println(ad);
	  }
	  
	  
	  System.out.println("Output::"+result);
	  System.out.println("Execution end");
	}

	static void mainTwo()
	{
	  System.out.println("Execution start");
	  int a=44,b=4;
	  int result=a/b;
	  
	  
	  try 
	  {
	    result=a/b;
	  }
	  
	  catch(ArithmeticException ad)
	  {
		  System.out.println("Can't divided by zero");
	  }
	  
	 finally
	  {
		  System.out.println(" Final Block");
	  }
	  
	  
	  System.out.println("Output::"+result);
	  System.out.println("Execution end");
	}


}
