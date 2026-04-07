package com.train.app;

import java.util.*;

/*
=====================================================
CLASS - Bogie
=====================================================
Represents a passenger bogie
*/

class Bogie {

    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}


/*
=====================================================
MAIN CLASS
=====================================================
*/

public class UseCase7SortBogies {

    public static void main(String[] args) {

        System.out.println("Sorting Bogies by Capacity");

        // Step 1: Create list
        List<Bogie> bogies = new ArrayList<>();

        // Step 2: Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // Step 3: Sort using Comparator (IMPORTANT LINE)
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        // Step 4: Display sorted list
        for (Bogie b : bogies) {
            System.out.println(
                    b.getName() + " - Capacity: " + b.getCapacity()
            );
        }
    }
}