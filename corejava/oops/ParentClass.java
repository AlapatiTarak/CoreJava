package com.corejava.oops;

public class ParentClass {

	public static void main(String[] args) {
		Child child = new Child();
	    child.mainOne();
	    System.out.println(Modifier.c);
	    System.out.println(Modifier.b);
	}

}

class GrandParent{
	int a=10,b=20;
	
	}
class Parent extends GrandParent{
	int c=50,d=20;
	}

 class Child extends Parent{
	 int e=40,f=40;
	 void mainOne() {
		 System.out.println(e+f);
		 System.out.println(c+d);
		 System.out.println(a+b);
	 }
 }