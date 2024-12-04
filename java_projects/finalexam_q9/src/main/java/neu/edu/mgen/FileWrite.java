package neu.edu.mgen;

import java.io.*;
import java.util.*;

public class FileWrite {
    public static void main(String[] args) {

        try {
            // Read from the file
            FileReader fileReader = new FileReader("myFile.txt");
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

            FileWriter fileWriter = new FileWriter("myFile.txt", true); // Append mode
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

        //System.out.println("Hello world!");
    }
}