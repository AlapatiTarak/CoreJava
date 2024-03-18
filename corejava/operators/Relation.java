package com.corejava.operators;

public class Relation {
	int a = 7;
    int b = 3;

    boolean method() 
	{
        boolean c = a < b;
        System.out.println("a < b ");
        return c;
    }
	boolean methodOne() 
	{
        boolean d= a > b;
        System.out.println("a > b ");
        return d;
    }
	boolean methodTwo() 
	{
        boolean e= a==b;
        System.out.println("a == b ");
        return e;
    }
	boolean methodThree() 
	{
        boolean f= a>=b;
        System.out.println("a >= b ");
        return f;
    }
	boolean methodFour() 
	{
        boolean g= a <= b;
        System.out.println("a <= b ");
        return g;
    }
	boolean methodFive() 
	{
        boolean h= a != b;
        System.out.println("a != b ");
        return h;
    }
}
