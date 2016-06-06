package com.clouway.exceptions;

import java.util.Scanner;

public class Demo {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Sumator sumator = new Sumator();
        Range check = new Range();
        List list = new List();
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
        System.out.println("Welcome to the third task! John's mother send him to the shop, she gave him a list of FIVE stuff he needs to buy, but he lost it. \n" + "Please help him recover it by entering the FIVE purchases he need to make!");
        try{
            list.add(7);
        }catch(ListOutOfSpace ex){
            ex.getMessage();
        }
        try{
            list.add('s');
        }catch(ListOutOfSpace ex){
            ex.getMessage();
        }
        try{
            list.add("Hi!!!");
        }catch(ListOutOfSpace ex){
            ex.getMessage();
        }
        list.printAllElements();
        try{
            list.remove();
        }catch(ListIsEmpty ex){
            ex.getMessage();
        }
        try{
            list.add(1);
        }catch(ListOutOfSpace ex){
            ex.getMessage();
        }
        try{
            list.add(2);
        }catch(ListOutOfSpace ex){
            ex.getMessage();
        }
        try{
            list.add(3);
        }catch(ListOutOfSpace ex){
            ex.getMessage();
        }
        list.printAllElements();
        System.out.print("You have completed the final third task in the Exception chapter, the Demo will now END!");
    }
}
