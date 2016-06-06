package com.clouway.exceptions.task1;

public class Sumator { // Class that gives the sum of two integer strings
    protected int sum(String a, String b) throws NumberFormatException{
        int numberA = 0, numberB = 0;
        numberA = Integer.parseInt(a);
        numberB = Integer.parseInt(b);
        return (numberA + numberB);
    }
}
