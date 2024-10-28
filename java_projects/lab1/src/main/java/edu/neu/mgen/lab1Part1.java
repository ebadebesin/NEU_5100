package edu.neu.mgen;

import java.util.Arrays;

public class lab1Part1 
{
    public static void main( String[] args )
    { 
        // Initialize two arrays x and y
        int[] x = {2, 9, 5, 7, 3};
        int[] y = {8, 1, 6, 4, 10};
        
        // Create a new array z to store the max values
        int[] z = new int[5];
        for (int i = 0; i < 5; i++) {
            z[i] = Math.max(x[i], y[i]);
        }

        // Print the arrays in a nicely formatted way
        System.out.println("Array x = " + Arrays.toString(x));
        System.out.println("Array y = " + Arrays.toString(y));
        System.out.println("Array z = x + y = " + Arrays.toString(z));

    }
}

//////////////Sample output////////////
/*
 * Array x = [2, 9, 5, 7, 3]
 * Array y = [8, 1, 6, 4, 10]
 * Array z = x + y = [8, 9, 6, 7, 10]
 */