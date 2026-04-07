package com.train.app;

import java.util.Arrays;

public class BogieNameSorter {

    // Method to sort bogie names
    public static void sortNames(String[] names) {
        Arrays.sort(names);
    }

    // Display method
    public static void display(String[] names) {
        System.out.println(Arrays.toString(names));
    }
}