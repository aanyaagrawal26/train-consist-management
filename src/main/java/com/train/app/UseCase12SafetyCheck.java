package com.train.app;

import java.util.*;

public class UseCase12SafetyCheck {

    public static void main(String[] args) {

        // Goods bogie list (type + cargo)
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Box", "Coal"));
        bogies.add(new GoodsBogie("Open", "Grain"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // ✅ UC12 LOGIC (allMatch + condition)
        boolean isSafe = bogies.stream()
                .allMatch(b -> {
                    if (b.getType().equalsIgnoreCase("Cylindrical")) {
                        return b.getCargo().equalsIgnoreCase("Petroleum");
                    }
                    return true; // other bogies allowed
                });

        // Output
        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("Train is NOT SAFE ❌");
        }
    }
}