package com.clouway.exceptions;

public class ListIsEmpty extends Exception{
    public ListIsEmpty(){
        super();
    }

    @Override
    public String getMessage(){
        return "The list is empty, there's nothing to be removed!";
    }
}
