package edu.neu.mgen;

import java.util.ArrayList;

public class EngClass {
    private ArrayList<Student> students;

    // Constructor
    public EngClass() {
        this.students = new ArrayList<>();
    }

    // Add a student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added: " + student);
    }

    // Delete a student by ID
    public void deleteStudent(String studentId) {
        boolean removed = students.removeIf(student -> student.getStudentId().equals(studentId));
        if (removed) {
            System.out.println("Student with ID " + studentId + " removed.");
        } else {
            System.out.println("Student with ID " + studentId + " not found.");
        }
    }

    // Display all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students enrolled in the class.");
        } else {
            System.out.println("List of students in the Engineering Class:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}
