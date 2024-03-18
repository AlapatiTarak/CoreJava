package com.corejava.task;

 public class Large {

	public static void main(String[] y) {
		 int  b=Integer.parseInt(y[0]);
		   int c=Integer.parseInt(y[1]);
		   int d=Integer.parseInt(y[2]);
		   method(b,c,d);
		}
	
	public  static void method(int b,int c , int d) {
		int Large=b;
		   if (c>Large)
		   Large=c;
		   if (d>Large)
		   Large=d;
		 System.out.println("The big number is" + Large);
	}

}
