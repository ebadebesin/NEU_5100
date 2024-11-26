package edu.neu.mgen;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Let's do some Summation!");

            System.out.print("Enter a number: ");
            int integerInput = Integer.parseInt(scanner.nextLine());
            System.out.println( "You entered: " + integerInput + ". I believe this is your number");

            System.out.print("Enter a floating-point number: ");
            float floatInput = Float.parseFloat(scanner.nextLine());
            // System.out.println("You entered " + floatInput);

            System.out.println("Now let us do some calculations...");

            float sum = integerInput + floatInput;

            System.out.println("The sum of the two numbers you entered: "+ sum);

        } catch (NumberFormatException e) {
            System.out.println("Error: Oh no... Invalid input. Please enter a valid number.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Program has completed.");
        }
    }
}


////////////////Sample output
// Let's do some Summation!
// Enter a number: /
// Error: Oh no... Invalid input. Please enter a valid number.
// Program has completed.

//OR

// Let's do some Summation!
// Enter a number: 2
// You entered: 2. I believe this is your number
// Enter a floating-point number: 2.5
// Now let us do some calculations...
// The sum of the two numbers you entered: 4.5
// Program has completed.