package com.train.app;

import java.util.LinkedList;
import java.util.List;

public class UseCase4MaintainOrderedConsist {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("======================================\n");

        // Create LinkedList
        List<String> trainConsist = new LinkedList<>();

        // Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist + "\n");

        // Insert Pantry Car at position 2
        trainConsist.add(2, "Pantry Car");

        System.out.println("After inserting 'Pantry Car' at position 2:");
        System.out.println(trainConsist + "\n");

        // Remove first and last bogie
        trainConsist.remove(0); // remove Engine
        trainConsist.remove(trainConsist.size() - 1); // remove Guard

        System.out.println("After removing first and last bogie:");
        System.out.println(trainConsist + "\n");

        System.out.println("UC4 ordered consist operations completed...");
    }
}