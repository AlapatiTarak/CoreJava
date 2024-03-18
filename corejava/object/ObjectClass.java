package com.corejava.object;

public class ObjectClass {
     
	public static void main(String[] args) {
	
		ObjectClass objectClass=new ObjectClass();
		ObjectNormalClass objectNormalClass=new ObjectNormalClass();
		System.out.println(objectClass.method());
		System.out.println(objectNormalClass.methodOne());
	}
	
 
	 int method() {
		int a=35,b=56;
		return a+b;
		
	}
	
}
