package com.clouway.exceptions.task1;

public class Sumator { // Class that gives the sum of two integer strings
    protected int sum(String a, String b) {
        int numberA = 0, numberB = 0;
        try {
            numberA = Integer.parseInt(a);
        }catch (NumberFormatException ex){
            throw new IncorrectInputException();
        }
        try {
            numberB = Integer.parseInt(b);
        }catch (NumberFormatException ex){
            throw new IncorrectInputException();
        }
        return (numberA + numberB);
    }
}
