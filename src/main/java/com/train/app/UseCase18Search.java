package com.train.app;

public class UseCase18Search {

    public static void main(String[] args) {

        String[] bogieIds = {
                "BG101", "BG205", "BG309", "BG412", "BG550"
        };

        String searchKey = "BG309"; // you can change this

        boolean found = BogieSearch.searchBogie(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie ID " + searchKey + " FOUND");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT FOUND");
        }
    }
}