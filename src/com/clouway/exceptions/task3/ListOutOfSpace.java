package com.clouway.exceptions.task3;

public class ListOutOfSpace extends Exception { // Exception that's thrown when the list is full and there is no more space
    public ListOutOfSpace(){
        super();
    }

    @Override
    public String getMessage(){
        return "The list is full! If you want to add new object, first you must delete at least one that is already in the list!";
    }
}
