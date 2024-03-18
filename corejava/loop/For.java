package com.corejava.loop;

public class For {
	
	public static void main(String[] args) {
		
    
	}
	static  void natural(int a) {
	for(int i=1; i<=a; i++) {
		System.out.println(i);
		
	}	 
		 
	 }
	static  void swapping(int a, int b) {
	for (int n=0; n<1; n++) {
		int temp=a;
        a=b;
        b=temp;
        System.out.println("b"+ b);
        System.out.println("a"+ a);
	}
	}
	
	static void fibonnaci(int f) {
		int a=0,b=1;
		int c=0;
		System.out.println(a);
		System.out.println(b);
		for(int i=1; i<f; i++){
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
		
	}	
	 static void primeNumber(int d) {
		int  k=0;
		 for(int i=1; i<=d; i++) {
			 if(d%i==0) {
				 k++;
			 }
		 }
			 if(k==2) {
				 System.out.println("prime");
			 }
			 else {
		    System.out.println("not prime");		 
		 }		 
		 }
	static void primeNumberSeries(int e) {
		
	    for (int i=2; i<=e; i++) {
	     int k=0;
	        for (int j=2; j<=i/2;j++) {
	            if (i%j==0) { 
	             k++;
	            }
	        }
	        if (k==0) {
	            System.out.println(i + " is a prime number");
	        }
	    }
	}
	static void methodSix() {
		int n=25;
	    for (int i=1; i<=n; i+=2) {
	           
	            System.out.println(i + " odd number");
	        }
	    }
	static void methodSeven() {
		int n=26;
	    for (int i=2; i<=n; i+=2) {
	           
	            System.out.println(i + " even number");
	        }
	    }
	static void primeNumbers(int n)
    {
        int z=0;
        for(int i=1;z!=n;i++)
        {
            int k=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0) k++;
            }
            if(k==2)
            {
                System.out.println(i);
                z++;
            }
        }
    }
}
		
	

	
	



