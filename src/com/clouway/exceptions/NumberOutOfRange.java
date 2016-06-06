package com.clouway.exceptions;

public class NumberOutOfRange extends Exception { // Exception that's thrown when the input number is not in the defined range

    public NumberOutOfRange(){
        super();
    }

    @Override
    public String getMessage(){
        return "Number out of range!";
    }
}