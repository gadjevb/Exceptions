package com.clouway.exceptions;

public class Range throws NumberOutOfRange{
    public void validationTest(int n){
        if(n < 0 && n > 10){
            throw new NumberOutOfRange();
        }
    }
}
