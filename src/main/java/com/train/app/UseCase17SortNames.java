package com.train.app;

public class UseCase17SortNames {

    public static void main(String[] args) {

        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        System.out.println("Before Sorting:");
        BogieNameSorter.display(bogieNames);

        // Using Arrays.sort()
        BogieNameSorter.sortNames(bogieNames);

        System.out.println("After Sorting:");
        BogieNameSorter.display(bogieNames);
    }
}