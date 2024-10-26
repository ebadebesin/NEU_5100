package edu.neu.mgen;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );

        // As the program starts, it prompts user in the terminal, “Enter any word:”
        Scanner scanner = new Scanner(System.in);
        //  1: Prompt the user to enter a word
        System.out.print("Enter any word: ");
        
        //  2: Record the start time
        long startTime = System.currentTimeMillis();
        
        //  3: Get the user input
        String word = scanner.nextLine();
        
        //  4: Record the end time
        long endTime = System.currentTimeMillis();
        
        //  5: Calculate the elapsed time in seconds by dividing by 1000
        double timeElapsed = (endTime - startTime) / 1000.0;

        //  6: Check if the word is empty
        if (word.isEmpty()) {
            System.out.println("You did not enter any word");
        } else {
            //  7: Calculate the length of the word
            int length = word.length();
            
            //  8: Classify the word based on its length
            String classifyWord;
            if (length <= 5) {
                classifyWord = "short";
            } else if (length <= 10) {
                classifyWord = "medium";
            } else {
                classifyWord = "long";
            }
            
            //  9: Print the results
            System.out.println("Your word is " + word);
            System.out.println("It is a " + classifyWord + " word");
            System.out.println("The length of the word is " + length);
            System.out.println("Your reaction time is " + timeElapsed + " seconds");
        }

        // Closing the scanner
        scanner.close();

    }
}




