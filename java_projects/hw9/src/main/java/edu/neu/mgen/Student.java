package edu.neu.mgen;


public class Student {
    private String studentId;
    private String firstName;
    private String lastName;

    // Constructor
    public Student(String studentId, String firstName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters
    public String getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + firstName + " " + lastName;
    }
}