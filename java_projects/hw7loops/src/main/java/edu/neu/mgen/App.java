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

        //define matrix A and B
        int[][] A = {{2,3,4},{3,4,5}};
        int[][] B = {{1,2},{3,4},{5,6}};

        // Get the dimensions of matrices
        int rowsA = A.length;        // Number of rows in A
        int colsA = A[0].length;     // Number of columns in A
        int rowsB = B.length;        // Number of rows in B
        int colsB = B[0].length;     // Number of columns in B

        // Print the input matrices
        System.out.println("Matrix A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix B:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

        // Check if the matrices can be multiplied
        if (colsA != rowsB) {
            System.out.println("Matrices cannot be multiplied. The number of columns in A must be equal to the number of rows in B.");
        }
        else{
            //if yes loop to calculate A*B
            int[][] C = new int[rowsA][colsB];
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB; j++) {
                    for (int k = 0; k < colsA; k++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
            //print the result
            System.out.println("The product of matrices A and B is:");
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB; j++) {
                    // System.out.print(C[i][j] + " ");
                    System.out.printf("%d ", C[i][j]);
                }
                    System.out.println();
            }
        }
        

    }
}

// Program
// You have two matrices A[][] = {{2,3,4},{3,4,5}} and B[][] = {{1,2},{3,4},{5,6}}
// First check if the matrices can be multiplied A*B.
// If yes, then use loops to calculate the product of these two matrices A*B
// Output the result.
// Comments:
// Learn first how to multiply matrices
// Use loops to go through the matrices.
// Your algorithm should be able to handle matrices of any size.