package com.corejava.array;

import java.util.Scanner;

import com.corejava.loop.For;

public class ArrayTask {
	public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
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
		System.out.println("1 is for Ascending Order");
		System.out.println("2 is for Descending Order");
		System.out.println("3 is for 1st half Ascending 2nd half Descending  ");
		System.out.println("4 is for 1st half Descending 2nd half Ascending");
		System.out.println("5 is for Prime numbers");
		System.out.println("Enter your Choice");
		int a=scanner.nextInt();
		if (a==1) {
	    main();
		}
		else if (a==2) {
		    mainOne();
			}
		else if (a==3) {
			mainTwo();
		}
		else if(a==4) {
			mainThree();
		}
		else if (a==5) {
			mainFour();
		}
		
		}
		
	
	static void main() {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=scanner.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=scanner.nextInt();
	}
	for(int i=0;i<n;i++) 
	{ 
		
		int temp;
		for(int j=i+1;j<n;j++)
			if(a[i]>a[j]) {
			 temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;
			}
		 System.out.println(a[i]);     
	}
}
	static void mainOne() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scanner.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scanner.nextInt();
		}
		for(int i=0;i<n;i++) 
		{ 
			
			int temp=0;
			for(int j=i+1;j<n;j++) {
				if(a[i]<a[j]) 
				 temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;
			}	
			 System.out.println(a[i]);     
		}
	}

	static void mainTwo() {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=scanner.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++) {
	a[i]=scanner.nextInt();
	}
    for(int i=0;i<n/2;i++) {
	for (int j=i+1;j<n/2;j++) {
	  if (a[i]>a[j]) {
	   int temp=a[i];
	    a[i]=a[j];
	    a[j]=temp;
	  }
	   }
	   }
    for (int i=n/2;i<n-1;i++) {
	 for (int j=i+1;j<n;j++) {
	   if (a[i]<a[j]){
	     int temp=a[i];
	      a[i]=a[j];
	      a[j]=temp;
	       }
	       }
		}
	 for (int i=0;i<n;i++){
	 System.out.println(a[i]);
	  }
	}
	static void mainThree() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scanner.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
		a[i]=scanner.nextInt();
		}
	    for(int i=0;i<n/2;i++) {
		for (int j=i+1;j<n/2;j++) {
		  if (a[i]<a[j]) {
		   int temp=a[i];
		    a[i]=a[j];
		    a[j]=temp;
		  }
		   }
		   }
	    for (int i=n/2;i<n-1;i++) {
		 for (int j=i+1;j<n;j++) {
		   if (a[i]>a[j]){
		     int temp=a[i];
		      a[i]=a[j];
		      a[j]=temp;
		       }
		       }
			}
		 for (int i=0;i<n;i++){
		 System.out.println(a[i]);
		  }
		}
	static void mainFour() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scanner.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scanner.nextInt();
		}
		
		for(int i=0;i<n;i++) 
		{ 
			
				 if(isPrime(a[i])) {
					 System.out.println(a[i]+"prime");
					 }
				 }
	

	}
	static boolean isPrime(int a) {
		for (int i=2;i<=a/2;i++) {
			if (a%i==0)
				return false;
		}
		return true;
		
	}
	}

			
		
	



	




