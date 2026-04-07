package com.train.app;

import java.util.*;
import java.util.stream.Collectors;

public class UseCase8FilterBogies {

    public static void main(String[] args) {

        // Reusing Bogie list (same like UC7)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("General", 90));
        bogies.add(new Bogie("Luxury", 65));

        System.out.println("Original Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b.getName() + " - " + b.getCapacity());
        }

        // ✅ UC8 LOGIC (IMPORTANT PART)
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.getCapacity() > 60)   // condition
                .collect(Collectors.toList());

        // Display filtered bogies
        System.out.println("\nFiltered Bogies (capacity > 60):");
        for (Bogie b : filteredBogies) {
            System.out.println(b.getName() + " - " + b.getCapacity());
        }
    }
}