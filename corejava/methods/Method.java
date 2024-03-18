package com.corejava.methods;

public class Method {
	static  int a=16,b=14;
	 int c=45,d=55;
	static Method method=new Method();
	public static void main(String[] args) {
		method();
		method.methodOne(a,b);
		method.methodOne(method.c, method.d);
	}
   static void method() {
	System.out.println("Hello"); 
 }
    int methodOne(int c, int d) {
	   System.out.println(c+d);
	   return c+d;
   }
}
