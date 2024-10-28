package edu.neu.mgen;

/**
 * Hello world!
 *
 */
public class App 
{

    // Method to reverse the array and each string inside the array
    public static void reverseAndInvertArray(String[] arr) {
        System.out.println("Original array:");
        for (String word : arr) {
            System.out.println("\"" + word + "\",");
        }
        System.out.println("End of the array\n");

        System.out.println("Resultant array:");
        for (int i = arr.length - 1; i >= 0; i--) {
            String reversedWord = reverseAndCapitalize(arr[i]);
            System.out.println("\"" + reversedWord + "\",");
        }
        System.out.println("End of the array\n");

    }

    // Helper function (method) to reverse a string and capitalize the first letter
    private static String reverseAndCapitalize(String input) {
        char[] reversedChars = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            reversedChars[i] = input.charAt(input.length() - 1 - i);
        }
        String reversed = new String(reversedChars);
        return reversed.substring(0, 1).toUpperCase() + reversed.substring(1).toLowerCase();
    }
    

    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );

        // Test with two different arrays
        String[] array1 = {"Anne", "John", "Alex", "Jessica"};
        String[] array2 = {"Sun", "Mercury", "Venis", "Earth", "Mars", "Jupiter"};

        // Call the processAndPrintArray method for both arrays
        reverseAndInvertArray(array1);
        reverseAndInvertArray(array2);
    }
}

// Develop the following program:
// There is an array of Strings defined in the class: {“Anne”, “John”, “Alex”, “Jessica”}. 
// Create a method that returns a new array that consists of all elements of the original array in the inverse order.
// Each element (string) in the resultant array is written backward compared to the original string (as the inverse words) – example “abc” -> “cba”.
// Each element (string) in the resultant array starts with the capital letter, and all other letters are lower case.
// The main program calls the created methods that prints the original and resultant arrays as shown below:
// Original array:

// “Anne”,
// “John”,
// “Alex”,
// “Jessica”
// End of the array

// Resultant array:
// “Acissej”,
// “Xela”,
// “Nhoj”,
// “Enna”
// End of the array

// Your method should be able to handle arrays of different lengths.
// Run this method by calling it twice in the same program for two different arrays shown below without changing the code in the method:
// array: {“Anne”, “John”, “Alex”, “Jessica”}
// array: {“Sun”, “Mercury”, “Venis”, “Earth”, “Mars”, “Jupiter”}

/**
    //////////////Sample Output///////////

    Original array:
    "Anne",
    "John",
    "Alex",
    "Jessica",
    End of the array

    Resultant array:
    "Acissej",
    "Xela",
    "Nhoj",
    "Enna",
    End of the array

    Original array:
    "Sun",
    "Mercury",
    "Venis",
    "Earth",
    "Mars",
    "Jupiter",
    End of the array

    Resultant array:
    "Retipuj",
    "Sram",
    "Htrae",
    "Sinev",
    "Yrucrem",
    "Nus",
    End of the array
**/