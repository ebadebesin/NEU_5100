package edu.neu.mgen;

import java.io.*;
import java.util.*;


/**
 * Hello world!
 * Develop the following program:
 * Open a Notepad application on your computer, write phrase “This is my Java read test”, and save it under filename “my_test_file.txt”
 * Read this file from your Java program and print the phrase in the Java terminal.
 * Enter phrase “Java write test” into your Java program from the Java terminal.
 * Save this phrase in the same file “my_test_file.txt” using your Java program,
 * Open file “my_test_file.txt” with Notepad and make sure that your last phrase is written into the file.
 *
 */
public class FileWrite 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );
        try {
            // Read from the file
            FileReader fileReader = new FileReader("my_test_file.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);

            }
            bufferedReader.close();
            fileReader.close(); 


            // Write to the file
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a phrase to write to the file: ");
            String phrase = scanner.nextLine();

            FileWriter fileWriter = new FileWriter("my_test_file.txt", true); // Append mode
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.newLine();
            bufferedWriter.write(phrase);
            bufferedWriter.close();
            fileWriter.close();
            scanner.close();

            System.out.println("Phrase written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}


/////////////////// sample output ///////////////////
// This is my Java read test
// Enter a phrase to write to the file: Java write test
// Phrase written to the file successfully.