package com.corejava.loop;

import java.util.Scanner;

import com.corejava.task.Large;

public class Programs {
	static Scanner scanner=new Scanner(System.in);
	   static void method() {
		   choice();
		   for(;;){
		   System.out.println("1.Continue");
		   System.out.println("2.Exit");
		   int b=scanner.nextInt();
		   if(b==1) {
			   choice(); 
		   }
		   else if (b==2) {
			   System.out.println("Programe Exit");
			   break;
		   }
		   }
	   }
	   


public static void choice(){
	Scanner scanner=new Scanner(System.in);
	System.out.println("1 is for Prime number");
	System.out.println("2 is for PrimeNumberSeries");
	System.out.println("3 is for fabinoci number");
	System.out.println("4 is for Swapping");
	System.out.println("5 is for large number");
	System.out.println("6 is for No.of prime numbers");
	System.out.println("Enter your Choice");
	int a=scanner.nextInt();
	if (a==1) {
	System.out.println("Enter the number");
	 int d=scanner.nextInt();
	 For.primeNumber(d);
	
	}
	
	else if (a==2) {
	System.out.println("Enter the number");
	int b=scanner.nextInt();

   For.primeNumberSeries(b);
	 }
	else if (a==3) {
	System.out.println("Enter the number");
	int b=scanner.nextInt();

	For.fibonnaci(b);
	}
	else if (a==4) {
 System.out.println("Enter the number");
 int b=scanner.nextInt();
	int c=scanner.nextInt();
	For.swapping(b,c);
	}
	
 
	else if (a==5) {
		System.out.println("Enter the number");
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		int d=scanner.nextInt();
		Large.method(b,c,d);
	}
	else if(a==6) {
		System.out.println("Enter the number");
		int b=scanner.nextInt();
		For.primeNumbers(b);
	}
	
}

}
