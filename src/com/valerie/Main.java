package com.valerie;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myIntValue = 5/3;
        //width of int = 32 (4 bytes)
        float myFloatValue = 5f / 3f;
        //width of float = 32 (4 bytes)
        double myDoubleValue = 5d / 3d;
//width of double = 64 (8 bytes)
        System.out.println("myIntValue = "+ myIntValue);
        System.out.println("myFloatValue = "+ myFloatValue);
        System.out.println("myDOubleValue = "+ myDoubleValue);
        //test
    double numberOfPounds = 5d;
    double conversion =  numberOfPounds * 0.45359237;
        System.out.println(conversion);

    }
}
