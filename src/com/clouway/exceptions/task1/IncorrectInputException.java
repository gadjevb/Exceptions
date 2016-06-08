package com.clouway.exceptions.task1;

public class IncorrectInputException extends NumberFormatException{
    public IncorrectInputException(){
        super();
    }

    @Override
    public String getMessage(){
        return "Incorrect input!";
    }
}
