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
        System.out.println( "It is my first Java program" );

        // Declaring and initializing variables
        int intVariable1 = 10, intVariable2 = 20;
        long longVariable1 = 100L, longVariable2 = 200L;
        double doubleVariable1 = 10.5, doubleVariable2 = 20.5;
        boolean booleanVariable1 = true, booleanVariable2 = false;
        char charVariable1 = 'A', charVariable2 = 'B';

        // Converting int to long
        long convertedLong1 = (long) intVariable1;
        long convertedLong2 = (long) intVariable2;
        
        // Converting long to int
        int convertedInt1 = (int) longVariable1; 
        int convertedInt2 = (int) longVariable2; 

        // Output initialized variables
        System.out.println("Initialized Variables:");
        System.out.println("intVariable1: " + intVariable1 + ", intVariable2: " + intVariable2);
        System.out.println("longVariable1: " + longVariable1 + ", longVariable2: " + longVariable2);
        System.out.println("doubleVariable1: " + doubleVariable1 + ", doubleVariable2: " + doubleVariable2);
        System.out.println("booleanVariable1: " + booleanVariable1 + ", booleanVariable2: " + booleanVariable2);
        System.out.println("charVariable1: " + charVariable1 + ", charVariable2: " + charVariable2);
        System.out.println("Converted long from int: " + convertedLong1 + ", " + convertedLong2);
        System.out.println("Converted int from long: " + convertedInt1 + ", " + convertedInt2);

        // Taking user input to enter values for variables from the terminal.
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer value: ");
        int userInt = scanner.nextInt();

        System.out.print("Enter a long value: ");
        long userLong = scanner.nextLong();

        System.out.print("Enter a double value: ");
        double userDouble = scanner.nextDouble();

        System.out.print("Enter a boolean value (true/false): ");
        boolean userBoolean = scanner.nextBoolean();

        System.out.print("Enter a character: ");
        char userChar = scanner.next().charAt(0);

        // Perform arithmetic operations
        int sum = intVariable1 + userInt;
        long product = longVariable1 * userLong;
        double difference = doubleVariable1 - userDouble;

        // Perform logical operations
        boolean andOperation = booleanVariable1 && userBoolean;
        boolean orOperation = booleanVariable1 || userBoolean;

        // Output results of operations
        System.out.println("\nResults of Operations:");
        System.out.println("\n--- Arithmetic Operations ---");
        System.out.println("Sum of intVariable1 and userInt: " + sum);
        System.out.println("Product of longVariable1 and userLong: " + product);
        System.out.println("Difference between doubleVariable1 and userDouble: " + difference);

        System.out.println("\n--- Logical Operations ---");
        System.out.println("AND operation result for booleanVariable1 && userBoolean: " + andOperation);
        System.out.println("OR operation result booleanVariable1 || userBoolean: " + orOperation);
        System.out.println("NOT boolVar1: " + (!booleanVariable1));

        
        System.out.println("\n--- Character Operations ---");
        System.out.println("Character comparison (charVariable1 == charVariable2): " + (charVariable1 == charVariable2));
        System.out.println("Character comparison (charVariable1 != charVariable2): " + (charVariable1 != charVariable2));
        System.out.println("Character comparison (charVariable1 < charVariable2): " + (charVariable1 < charVariable2));
        System.out.println("Character entered: " + userChar);
        
        // Closing the scanner
        scanner.close();

    }

// My single line comment: When ending a statetement, don't forget your semi-colon ';'

/*
 * Make sure to comment only when needed
 * This comment however is for assigment purposes
 * 
 * 

  Sample Output after running:
  It is my first Java program

  Initialized Variables:
    intVariable1: 10, intVariable2: 20
    longVariable1: 100, longVariable2: 200
    doubleVariable1: 10.5, doubleVariable2: 20.5
    booleanVariable1: true, booleanVariable2: false
    charVariable1: A, charVariable2: B
    Converted long from int: 10, 20
    Converted int from long: 100, 200
    Enter an integer value: 2
    Enter a long value: 325
    Enter a double value: 40.7
    Enter a boolean value (true/false): true
    Enter a character: b

    Results of Operations:

    --- Arithmetic Operations ---
    Sum of intVariable1 and userInt: 12
    Product of longVariable1 and userLong: 32500
    Difference between doubleVariable1 and userDouble: -30.200000000000003

    --- Logical Operations ---
    AND operation result for booleanVariable1 && userBoolean: true
    OR operation result booleanVariable1 || userBoolean: true
    NOT boolVar1: false

    --- Character Operations ---
    Character comparison (charVariable1 == charVariable2): false
    Character comparison (charVariable1 != charVariable2): true
    Character comparison (charVariable1 < charVariable2): true
    Character entered: b
    
 */
}
