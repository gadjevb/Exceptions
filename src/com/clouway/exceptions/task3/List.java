package com.clouway.exceptions.task3;

import java.util.ArrayList;

public class List {
    private ArrayList<Object> list = new ArrayList();
    private int size = 0;

    public void add(Object obj) throws ListOutOfSpace { // Adds an element to the list
        if (size < 5) {
            size++;
            list.add(obj);
        } else {
            throw new ListOutOfSpace();
        }
    }

    public void remove() throws ListIsEmpty { // Removes the last element of the list
        if (size > 0) {
            size--;
            list.remove(size);
        } else {
            throw new ListIsEmpty();
        }
    }

    public void printAllElements() { // Prints all elements of the list starting from the first
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }
}
