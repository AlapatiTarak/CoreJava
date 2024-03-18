package com.corejava.operators;

public class Solution {

    Input addition(Input in)
    {
        in.add=in.inputOne+in.inputTwo;
        return in;
    }
    
    Input subtraction(Input in)
    {
        in.sub=in.inputOne-in.inputTwo;
        return in;
    }

    Input multiplication(Input in)
    {
        in.mul=in.inputOne*in.inputTwo;
        return in;
    }

    Input division(Input in)
    {
        in.div=in.inputOne/in.inputTwo;
        return in;
    }

    Input modiv(Input in)
    {
        in.mod=in.inputOne%in.inputTwo;
        return in;
    }

}
