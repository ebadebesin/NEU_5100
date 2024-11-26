package edu.neu.mgen;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );

        // Initialize a matrix
        int[][] matrix = {
            {7, 8, 9, 10, 11},
            {11, 12, 13, 14},
        };

        // Display the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Calculate the sum of all numbers
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j]; // Add each element to the sum
            }
        }

        // Display the sum
        System.out.println(" \nSum of all numbers in the matrix: " + sum);




    }
}

/*

9. Develop a program that calculates the sum of all elements of a matrix. Use loops. For example, in case of matrix {{1,2,3}, {4,5,6}}, the output should be 21 which is 1+2+3+4+5+6.
Initiate any matrix of any size no less than 2 x 3 in your program. Show the matrix as an output of the program. Run the program. Do not use square matrices (with the same number of rows and columns).
Make a screenshot of the output.
Submit both the actual source code file with the program and matrix (the actual java file that can be copied and run) and the snapshot image file of the program output. Thus, submit two files - one the actual java file with the source code and another image file with the screenshot of the output.

*/