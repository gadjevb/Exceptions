package com.clouway.exceptions;

import java.util.Scanner;

public class Demo {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Sumator sumator = new Sumator();
        System.out.println("Please Enter the numbers(integers) you wish to sum: ");
        System.out.print("First number: ");
        String a = sc.nextLine();
        System.out.print("Second number: ");
        String b = sc.nextLine();
        sumator.sum(a,b);
    }
}
