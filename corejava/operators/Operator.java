package com.corejava.operators;

public class Operator {

	public static void main(String[] args) {
		Assign assign = new Assign();
		Uninary uninary = new Uninary();
		Relation relation = new Relation();
        System.out.println(relation.method());
		System.out.println(relation.methodOne());
		System.out.println(relation.methodTwo());
		System.out.println(relation.methodThree());
		System.out.println(relation.methodFour());
		System.out.println(relation.methodFive());
		System.out.println(uninary.method());
		System.out.println(uninary.a);
		System.out.println(uninary.methodOne());
		System.out.println(uninary.a);
		System.out.println(uninary.methodTwo());
		System.out.println(uninary.a);
		System.out.println(uninary.methodThree());
		System.out.println(assign.method());
		System.out.println(assign.methodOne());
		System.out.println(assign.methodTwo());
		System.out.println(assign.methodThree());
		System.out.println(assign.methodFour());
    }

	}


