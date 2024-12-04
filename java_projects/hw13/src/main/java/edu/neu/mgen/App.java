package edu.neu.mgen;

import java.sql.*;

public class App {
    // Database configuration
    static final String dbURL = "jdbc:mysql://127.0.0.1:3306/students";
    static final String dbname = "root";
    static final String password = "aliciakeys22";

    public static void main(String[] args) {
        Connection conn = null;

        try {
            // Connect to the database
            conn = DriverManager.getConnection(dbURL, dbname, password);
            conn.setAutoCommit(false); // Enable transactions

            // 1. Read a Record
            String selectSql = "SELECT * FROM students WHERE id = ?";
            PreparedStatement selectStmt = conn.prepareStatement(selectSql);
            selectStmt.setInt(1, 2); // Replace 2 with the desired ID
            ResultSet rs = selectStmt.executeQuery();

            if (rs.next()) {
                // Retrieve original record
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println("Original Record: ID=" + id + ", Name=" + name + ", Age=" + age);

                // 2. Modify the Record
                int newAge = age + 1; // Increment the age
                System.out.println("Modified Age: " + newAge);

                // 3. Update the Database
                String updateSql = "UPDATE students SET age = ? WHERE id = ?";
                PreparedStatement updateStmt = conn.prepareStatement(updateSql);
                updateStmt.setInt(1, newAge);
                updateStmt.setInt(2, id);
                int rowsUpdated = updateStmt.executeUpdate();

                if (rowsUpdated > 0) {
                    System.out.println("Record updated successfully in the database.");
                } else {
                    System.out.println("Failed to update record.");
                }

                // Simulate an error to test rollback (uncomment to test rollback)
                // throw new SQLException("Simulated error to test rollback");
            } else {
                System.out.println("Record not found.");
            }

            // Commit transaction
            // conn.commit();
            // System.out.println("Transaction committed successfully.");

            //rollback
            conn.rollback();
            System.out.println("Rolledback Successfully");


           
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
            if (conn != null) {
                try {
                    // Rollback the transaction
                    conn.rollback();
                    System.out.println("Transaction rolled back.");
                } catch (SQLException rollbackEx) {
                    System.err.println("Error during rollback: " + rollbackEx.getMessage());
                }
            }
        } finally {
            if (conn != null) {
                try {
                    conn.close(); // Close the connection
                    System.out.println("Database connection closed.");
                } catch (SQLException closeEx) {
                    System.err.println("Error closing connection: " + closeEx.getMessage());
                }
            }
        }
    }
}

// // Develop the following program:
// // Connect to the database from your Java program and read anyone record from it,
// // Modify the record in the Java program.
// // Update the appropriate record in the database.
// // Make sure you restore (rollback) the previous information in the database to continue your database class assignments

////////////////////Sample output
/// Original Record: ID=2, Name=Brin, Age=23
// Modified Age: 24
// Record updated successfully in the database.
// Rolledback Successfully
// Database connection closed.