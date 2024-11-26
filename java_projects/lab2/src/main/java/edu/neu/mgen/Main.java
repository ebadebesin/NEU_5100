package edu.neu.mgen;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );
        Bird sparrow = new Bird("Sparrow", 0.02, 0.15, false, "Passer domesticus", 0.2);
        LandAnimal lion = new LandAnimal("Lion", 180, 2.5, true, 4);
        Fish shark = new Fish("Great White Shark", 2000, 6, true, 2);

        System.out.println("The Animals");
        System.out.println("\n");

        System.out.println("The "+ sparrow.name);
        sparrow.makeSound();
        sparrow.move();
        //new line
        System.out.println("\n");

        System.out.println("The "+ lion.name);
        lion.makeSound();
        lion.move();
        System.out.println("\n");

        System.out.println("The "+ shark.name);
        shark.makeSound();
        shark.move();
        System.out.println("\n");

    }
}

// /////////// sample output ///////////

// The Animals

// The Sparrow
// Chirping sound
// Flying through the sky

// The Lion
// Roaring sound
// Walking on land

// The Great White Shark
// Gurgling sound
// Swimming in water
