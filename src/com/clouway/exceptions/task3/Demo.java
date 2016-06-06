package com.clouway.exceptions.task3;

import java.util.Scanner;

public class Demo {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        List list = new List();
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
        try{
            list.add(9);
        }catch(ListOutOfSpace ex){
            System.err.println(ex.getMessage());
        }
        list.printAllElements();
    }
}
