package edu.neu.mgen;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );

        // 1) String Operations
        String str = "Oakland";

        // Find the length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // Find a character with index 2 in the string
        char character = str.charAt(2);
        System.out.println("Character at index 2: " + character);

        // Extract a substring "land" from str
        String substring = str.substring(3);
        System.out.println("A.) Substring: " + substring);
        ////OR//
        String substringLand = str.substring(str.indexOf("land"));
        System.out.println("B.) Extracted substring 'land': " + substringLand);


        // Convert all letters in str to capital letters
        String uppercaseStr = str.toUpperCase();
        System.out.println("Uppercase string: " + uppercaseStr);


        // 2) Array Operations
        int[] abc = {1, 3, 5, 2, 5};

        // Find the length of the array
        int arrayLength = abc.length;
        System.out.println("Length of the array: " + arrayLength);

        // Find the last member of the array (-1 helps you get the element at the last index because index starts from 0)
        int lastElement = abc[arrayLength - 1];
        System.out.println("Last element of the array: " + lastElement);


        // 3) ArrayList Operation
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Austin");
        cities.add("Houston");
        cities.add("Oakland");
        cities.add("Paris");
        cities.add("San Francisco");
        cities.add("Seattle");


        // Remove "Paris" from the ArrayList
        cities.remove("Paris");

        System.out.println("ArrayList after removing Paris: " + cities);


        // ///////////////Output:
        
        // Length of the string: 7
        // Character at index 2: k
        // A.) Substring: land
        // B.) Extracted substring 'land': land
        // Uppercase string: OAKLAND
        // Length of the array: 5
        // Last element of the array: 5
        // ArrayList after removing Paris: [Austin, Houston, Oakland, San Francisco, Seattle]



    }
}
