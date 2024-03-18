package com.corejava.methods;

public class OverLoading {

	public static void main(String[] args) {
		OverLoading overLoading = new OverLoading();

        
		overLoading.display();
		overLoading.display(10); 
		overLoading.display("Hello", 20);
    }
	

	    // Method with no parameters
	    public void display() {
	        System.out.println("No parameters provided.");
	    }

	    // Method with one parameter of type int
	    public void display(int number) {
	        System.out.println("The number is: " + number);
	    }

	    // Method with two parameters of different types
	    public void display(String message, int number) {
	        System.out.println("Message: " + message + ", Number: " + number);
	    }
	}
    

