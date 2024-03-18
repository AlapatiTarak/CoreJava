package com.corejava.operators;

public class ArithemeticOperators {
	 
	public static void main(String[] args) {

    Input in=new Input();
    in.inputOne=3;
    in.inputTwo=4;
    Solution s=new Solution();
    s.addition(in);
    s.subtraction(in);
    s.multiplication(in);
    s.division(in);
    s.modiv(in);
    System.out.println(in.add);
    System.out.println(in.sub);
    System.out.println(in.mul);
    System.out.println(in.div);
    System.out.println(in.mod);
}	
}	
