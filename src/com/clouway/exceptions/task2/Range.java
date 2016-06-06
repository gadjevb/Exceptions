package com.clouway.exceptions.task2;

public class Range {

    private int lowBoundary;
    private int highBoundary;

    public Range(int lowBoundary, int highBoundary) {
        this.lowBoundary = lowBoundary;
        this.highBoundary = highBoundary;
    }

    public void isInRange(int n) throws NumberOutOfRange { // Validation test for the input number corresponding to the NumberOutOfRange exception

        if (n < lowBoundary || n > highBoundary) {
            throw new NumberOutOfRange();
        }
    }
}
