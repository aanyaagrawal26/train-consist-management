package com.train.app;

import java.util.*;

public class UseCase10TotalSeats {

    public static void main(String[] args) {

        // Reuse bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("General", 90));

        // ✅ UC10 LOGIC (map + reduce)
        int totalSeats = bogies.stream()
                .map(b -> b.getCapacity())   // extract capacity
                .reduce(0, Integer::sum);    // sum all

        // Display result
        System.out.println("Total Seating Capacity: " + totalSeats);
    }
}