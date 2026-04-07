package com.train.app;

import java.util.*;
import java.util.stream.Collectors;

public class UseCase9GroupBogies {

    public static void main(String[] args) {

        // Reuse bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("Sleeper", 65));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("AC Chair", 55));

        // ✅ UC9 LOGIC (grouping)
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getName));

        // Display grouped result
        System.out.println("Grouped Bogies:");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\nType: " + entry.getKey());

            for (Bogie b : entry.getValue()) {
                System.out.println("  " + b.getName() + " - " + b.getCapacity());
            }
        }
    }
}