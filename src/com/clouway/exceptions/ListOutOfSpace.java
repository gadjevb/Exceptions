package com.clouway.exceptions;

public class ListOutOfSpace extends Exception {
    public ListOutOfSpace(){
        super();
    }

    @Override
    public String getMessage(){
        return "The list is full! If you want to add new object, first you must delete at least one that is already in the list!";
    }
}
