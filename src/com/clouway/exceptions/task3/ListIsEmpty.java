package com.clouway.exceptions.task3;

public class ListIsEmpty extends Exception{ // Exceptions that's thrown when the list is empty
    public ListIsEmpty(){
        super();
    }

    @Override
    public String getMessage(){
        return "The list is empty, there's nothing to be removed!";
    }
}
