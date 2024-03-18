package com.corejava.collections;

import java.util.Arrays;

public class PraticeJava {

	public static void main(String[] args) {
		 //String a="god";
		 //String b="dog";
		 
		//char[] a1=a.toCharArray();
		//char[] b1=b.toCharArray();
		//Arrays.sort(a1);
		//Arrays.sort(b1);
		//System.out.println(Arrays.toString(a1));
		//System.out.println(Arrays.toString(b1));
		 
		//System.out.println(Arrays.equals(a1, b1));
		 
		        int rows = 5;   
  
		        for (int i = 0; i < rows; i++) {
		             
		            for (int j = 0; j <= i; j++) {
		                System.out.print("* ");
		            }
		            System.out.println();  
		            starPattren();
		            
		    }
		}
	static void starPattren()
	   {
	       int a=5;
	       for(int i=0;i<a;i++)
	       { 
	          for(int j=0;j<a*2;j++)
	          {
	              if((j==a-1-i || j==a-1+i)) System.out.print("* ");
	              else System.out.print("  ");
	          }
	          System.out.println();   
	       }   

	       for(int i=a-2;i>=0;i--)
	       { 
	          for(int j=0;j<=a*2;j++)
	          {
	              if((j==a-1-i || j==a-1+i)) System.out.print("* ");
	              else System.out.print("  ");
	          }
	          System.out.println();        
	       }   
	   }

	}


