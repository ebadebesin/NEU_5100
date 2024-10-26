package edu.neu.mgen;

import java.util.ArrayList;

public class lab1Part2 {
    public static void main( String[] args )
    {
        // Initialize an ArrayList of names
        ArrayList<String> names = new ArrayList<>();
        names.add("Ebun");
        names.add("Bolu");
        names.add("Tobi");
        names.add("David");
        names.add("Lara");

        // Create a new ArrayList to store modified names
        ArrayList<String> switchedNames = new ArrayList<>();

        for (String name : names) {
            if (name.length() > 1) {
                // Switch the first and last letters
                String modifiedName = name.charAt(name.length() - 1) + 
                                      name.substring(1, name.length() - 1).toLowerCase() + 
                                      name.charAt(0);
                // Capitalize the first letter and convert the rest to lowercase
                modifiedName = modifiedName.substring(0, 1).toUpperCase() + 
                               modifiedName.substring(1).toLowerCase();
                switchedNames.add(modifiedName);
            } else {
                // If the name has only one letter, no need to switch
                switchedNames.add(name);
            }
        }

        // Print the original and modified names
        System.out.println("Names = " + names);
        System.out.println("Names (switched) = " + switchedNames);
    }
}
