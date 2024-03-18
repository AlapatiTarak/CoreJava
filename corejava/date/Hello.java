package com.corejava.date;

public class Hello {

	public static void main(String[] args) {
		String a="tarakram";
		System.out.println(mainOne(a));
		
	}
	
     static String mainOne(String s)
    {
	   
	  String a="";
	  
	  for(int i=s.length()-1;i>=0;i--) 
	  {
		  
		
		a+=s.charAt(i);
		  
	  }
	  return a;
  }
}
