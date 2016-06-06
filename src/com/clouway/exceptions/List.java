package com.clouway.exceptions;

import java.util.ArrayList;

public class List {
    private ArrayList<Object> list = new ArrayList();
    private int size = 0;

    public void add(Object obj) throws ListOutOfSpace{
        if(size < 5){
            size++;
            list.add(obj);
            System.out.println("The object (" + obj + ") is successfully added to the list!");
        }else{
            throw new ListOutOfSpace();
        }
    }

    public void remove() throws ListIsEmpty{
        if(size > 0){
            size--;
            System.out.println("You have successfully removed (" + list.get(size) + ") out of the list!");
            list.remove(size);
        }else{
            throw new ListIsEmpty();
        }
    }

    public void printAllElements(){
        for(int i = 0; i < list.size(); i++){
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }
}
