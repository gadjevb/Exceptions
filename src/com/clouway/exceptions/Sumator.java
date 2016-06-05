package com.clouway.exceptions;

public class Sumator {
    protected void sum(String a, String b){
        int numberA = 0, numberB = 0;
        boolean flag = true;
        boolean check = true;
        try{
            numberA = Integer.parseInt(a);
        }catch (NumberFormatException ex){
            for(int i = 0; i < a.length(); i++){
                if(a.charAt(i) < 48 || a.charAt(i) > 57){
                    System.out.println("In the first number, at position " + (i+1) + " you have entered (" + a.charAt(i) + ") instead of number!");
                    flag = false;
                    check = false;
                }
            }
            if(check){
                flag = false;
            }
        }
        try{
            numberB = Integer.parseInt(b);
        }catch (NumberFormatException ex){
            for(int i = 0; i < b.length(); i++){
                if(b.charAt(i) < 48 || b.charAt(i) > 57){
                    System.out.println("In the second number, at position " + (i+1) + " you have entered (" + b.charAt(i) + ") instead of number!");
                    flag = false;
                    check = false;
                }
            }
            if(check){
                flag = false;
            }
        }
        if(flag == true && check == true){
            System.out.print("The sum is: " + (numberA + numberB) + "\n");
        }else if(flag == false && check == true){
            System.out.print("The value you entered surpasses the integer range of -2,147,483,648 to 2,147,483,647 or you have entered an empty line!");
        }
    }
}
