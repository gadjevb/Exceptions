package com.clouway.exceptions;

import java.util.Scanner;

public class Demo {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Sumator sumator = new Sumator();
        Range check = new Range();
        System.out.println("The Demo will begin with the first task in the Exception chapter!");
        System.out.println("Please Enter the numbers(integers) you wish to sum: ");
        System.out.print("First number: ");
        String a = sc.nextLine();
        System.out.print("Second number: ");
        String b = sc.nextLine();
        sumator.sum(a,b);
        System.out.println("The Demo completed the first task in the Exception chapter. Now the second starts!");
        System.out.println("To continue enter a number in the range of [0,10]!");
        try{
            check.validationTest(sc.nextInt());
        }catch (NumberOutOfRange ex){
            System.out.println(ex.getMessage());
        }
    }
}
