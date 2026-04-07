package com.train.app;

public class BogieSearch {

    // Linear Search Method
    public static boolean searchBogie(String[] bogieIds, String key) {

        for (int i = 0; i < bogieIds.length; i++) {

            // use equals() for string comparison
            if (bogieIds[i].equals(key)) {
                return true; // found → early stop
            }
        }

        return false; // not found
    }
}