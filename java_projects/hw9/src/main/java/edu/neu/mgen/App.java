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
        EngClass engClass = new EngClass();

        // Create sample students
        Student student1 = new Student("001", "Ebun", "Adebesin");
        Student student2 = new Student("002", "Jane", "Doe");
        Student student3 = new Student("003", "David", "Smith");

        // Add students to the engineering class
        engClass.addStudent(student1);
        engClass.addStudent(student2);
        engClass.addStudent(student3);

        // Display all students
        engClass.displayStudents();

        // Delete a student by ID
        engClass.deleteStudent("002");

        // Display all students after deletion
        engClass.displayStudents();

    }
}


// Develop the following program:
// There are two classes “EngClass” and “Student”.
// Class “Student” describes a student. You may use just three attributes for simplicity: student ID, first name, and last name.
// Class “EngClass” describes an engineering class that includes students. For simplicity, you may limit the attributes of this class with just a list of students.
// In the program, you should be able to add/delete students to the engineering class and read the list of students.