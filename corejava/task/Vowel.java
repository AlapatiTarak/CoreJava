package com.corejava.task;

public class Vowel {

	public static void main(String[] y) {
		char a=y[0].charAt(0);
		
	     if (a == 'a' || a == 'e' || a == 'i' || a == 'o'
	            || a == 'u' || a == 'A' || a == 'E' || a == 'I'
	            || a == 'O' || a == 'U')
	            System.out.println("It is a Vowel.");
	        else
	            System.out.println("It is a Consonant.");
	    }
}
