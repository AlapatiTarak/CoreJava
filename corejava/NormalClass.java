package com.corejava;

class NormalClass {
	 // instance variables
     int a;
    String b;

 // Default constructor
    public NormalClass() {
     
    }

    public NormalClass(int number, String str) {
        this.a= number;
        this.b = str;
    }

    // Methods
    public void setMyNumber(int number) {
        this.a = number;
    }

    public int getMyNumber() {
        return a;
    }

    public void setMyString(String str) {
        this.b = str;
    }

    public String getMyString() {
        return b;
    }
}