package com.clouway.exceptions;

public class Range {
    public void validationTest(int n) throws NumberOutOfRange{ // Validation test for the input number corresponding to the NumberOutOfRange exception
        if(n < 0 || n > 10){
            throw new NumberOutOfRange();
        }else {
            System.out.println("The number you entered checks in the given range, the Demo will now proceed!");
        }
    }
}
