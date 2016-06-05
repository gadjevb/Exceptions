package com.clouway.exceptions;

public class Range {
    public void validationTest(int n) throws NumberOutOfRange{
        if(n < 0 || n > 10){
            throw new NumberOutOfRange();
        }else {
            System.out.println("The number you entered checks in the given range, the Demo will now proceed!");
        }
    }
}
