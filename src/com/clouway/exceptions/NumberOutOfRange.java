package com.clouway.exceptions;

public class NumberOutOfRange extends Exception {

    public NumberOutOfRange(){
        super("Input out of range!");
    }

    public NumberOutOfRange(Throwable throwable){
        super(throwable);
    }

    public NumberOutOfRange(String message){
        super(message);
    }

    public NumberOutOfRange(String message, Throwable throwable){
        super(message, throwable);
    }
}