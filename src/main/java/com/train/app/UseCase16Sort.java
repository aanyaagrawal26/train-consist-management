package com.train.app;

public class UseCase16Sort {

    public static void main(String[] args) {

        // Sample capacities (you can change or take input)
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Before Sorting:");
        PassengerBogieSorter.display(capacities);

        // Sorting using Bubble Sort
        PassengerBogieSorter.sortCapacities(capacities);

        System.out.println("After Sorting:");
        PassengerBogieSorter.display(capacities);
    }
}