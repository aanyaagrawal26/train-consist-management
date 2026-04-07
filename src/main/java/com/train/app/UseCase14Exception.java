package com.train.app;

public class UseCase14Exception {

    public static void main(String[] args) {

        try {
            // ✅ Valid bogie
            Bogie b1 = new Bogie("Sleeper", 72);
            System.out.println("Created: " + b1.getName());

            // ❌ Invalid bogie (will throw exception)
            Bogie b2 = new Bogie("AC Chair", -10);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
