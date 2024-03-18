package com.corejava.oops;

final class TestOne extends Test {
  final int a=50;
   
	void mainOne(int a, int b) {
		a=25;
		System.out.println(super.a);
		System.out.println(a);
	}
}
