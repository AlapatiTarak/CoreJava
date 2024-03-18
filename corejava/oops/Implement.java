package com.corejava.oops;

public class Implement implements TestInterface {
     int a;
	
	public int main() {
		
		return a=14;
		
	}

	
	public void mainOne() {
		System.out.println("CodeBegun");
		
	}



	public void mainTwo() {
		int  k=0;
		int d=29;
		 for(int i=1; i<=d; i++) {
			 if(d%i==0) {
				 k++;
			 }
		 }
			 if(k==2) {
				 System.out.println(d+" is a prime number");
			 }
			 else {
		    System.out.println(d+" is not a prime number");		 
		 }		 
		
	}
	
  
}
