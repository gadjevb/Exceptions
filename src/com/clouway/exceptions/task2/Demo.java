package com.clouway.exceptions.task2;

import java.util.Scanner;

public class Demo {
    public static void main(String [] args){

        Range firstRange = new Range(0, 10);


        try {
            firstRange.isInRange(5);
            System.out.println("5 is in range from 0 to 10");
        } catch (NumberOutOfRange numberOutOfRange) {
            System.out.println("5 is out of range from 0 to 10");
        }

        try {
            new Range(1, 5).isInRange(2);
            System.out.println("2 is in range from 1 to 5");
        } catch (NumberOutOfRange numberOutOfRange) {
            System.out.println("2 is out of range from 1 to 5");
        }
    }
}
