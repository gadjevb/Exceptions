package com.clouway.exceptions;

public class NumberOutOfRange extends Exception {

    public NumberOutOfRange(){
        super();
    }

    @Override
    public String getMessage(){
        return "Number out of range!";
    }
}