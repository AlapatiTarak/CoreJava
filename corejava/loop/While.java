package com.corejava.loop;
import java.util.Scanner;

public class While {

	public static void main(String[] args)
	{
     int d=30;
		  
     method(d);
     methodOne(7);
     methodTwo(50);
     methodThree(10);
	}
static void method(int d) 
{
  int i=0;
  while (i<=d) 
  {
	if (i==22) 
	{ 
	  i++;
	  continue;
	}
	 System.out.println(i);
	  i++;
  }
}
	       

static void methodOne(int a) 
 {
  int i=1;
  int k=0;
  while(i<=a) 
  {
	if(a%i==0)
	{
	  k++;
	}
	  i++;
  }
   if(k==2) 
   System.out.println("prime");
   else
   System.out.println("not prime");        		
}
	      
static void methodTwo(int n)
{
  int i=1,k=0; 
  while (i<=n) 
  {
	k=0;
	int j=1;
	while(j<=i)
	{
	if(i%j==0) 
	k++;
	j++;
	}
	if(k==2) 
	System.out.println(i); 
	i++;
  }
		        			
}	        		
static void methodThree(int n)
{
 int z=0;
 int k;
 int i=2;
 while (z!=n) 	
 {
  k=0;
  int  j=1;
  while(j<=i)
  {
   if(i%j==0) 
	k++;
	j++;
  }
    if(k==2) 
	System.out.println(i); 
	z++;
    i++;
	}
  }
}	        		 
	        		
