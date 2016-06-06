package com.clouway.exceptions;

public class Sumator { // Class that gives the sum of two integer strings
    protected void sum(String a, String b){
        int numberA = 0, numberB = 0;
        boolean flag = true;
        boolean check = true;
        try{ // Parsing the first number from String to Integer
            numberA = Integer.parseInt(a);
        }catch (NumberFormatException ex){
            for(int i = 0; i < a.length(); i++){
                if(a.charAt(i) < 48 || a.charAt(i) > 57){ // checking if the exception that was thrown was caused by incorrect input in the first number (is there a letter or other symbol different from digit)
                    System.err.println("In the first number, at position " + (i+1) + " you have entered (" + a.charAt(i) + ") instead of number!");
                    flag = false;
                    check = false;
                }
            }
            if(check){
                flag = false;
            }
        }
        try{ // Parsing the second number from String to Integer
            numberB = Integer.parseInt(b);
        }catch (NumberFormatException ex){
            for(int i = 0; i < b.length(); i++){
                if(b.charAt(i) < 48 || b.charAt(i) > 57){ // checking if the exception that was thrown was caused by incorrect input in the second number (is there a letter or other symbol different from digit)
                    System.err.println("In the second number, at position " + (i+1) + " you have entered (" + b.charAt(i) + ") instead of number!");
                    flag = false;
                    check = false;
                }
            }
            if(check){
                flag = false;
            }
        }
        if(flag == true && check == true){ // Checking if everything went fine
            System.out.print("The sum is: " + (numberA + numberB) + "\n");
        }else if(flag == false && check == true){ // Checking if the exception that was thrown was caused by incorrect length of the input
            System.err.print("The value you entered surpasses the integer range of -2,147,483,648 to 2,147,483,647 or you have entered an empty line!");
        }
    }
}
