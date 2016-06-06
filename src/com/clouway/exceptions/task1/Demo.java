package com.clouway.exceptions.task1;

import java.util.Scanner;

public class Demo {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Sumator sumator = new Sumator();
        System.out.println("Please enter the numbers(integers) you wish to sum: ");
        System.out.print("First number: ");
        String a = sc.nextLine();
        System.out.print("Second number: ");
        String b = sc.nextLine();
        try {
            System.out.print(sumator.sum(a,b));
        } catch (NumberFormatException ex) {
            System.out.print("Invalid number input or input is out of Integer range!");
        }
    }
}
