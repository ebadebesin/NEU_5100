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
        Vehicle car = new Car("Mercedes", "Space Grey", 4);
        Vehicle bike = new Motorbike("Vesper Bike", "Black", false);
        Vehicle plane = new Aircraft("Boeing 737", "White", 40000);
        Vehicle ship = new Ship("The Cruiser", "White", 2000);

        System.out.println("This is a " + car.name);
        car.start();
        car.move();
        car.stop();
        System.out.println("\n");

        System.out.println("This is a " + bike.name);
        bike.start();
        bike.move();
        bike.stop();
        System.out.println("\n");

        System.out.println("This is a " + plane.name);
        plane.start();
        plane.move();
        plane.stop();
        System.out.println("\n");

        System.out.println("This is a " + ship.name);
        ship.start();
        ship.move();
        ship.stop();
    }
}


//////////// Sample Output /////////////////
/**
    This is a Mercedes
    The Mercedes started from home
    The Mercedes is moving on road
    The Mercedes stopped at destination


    This is a Vesper Bike
    The Vesper Bike left destination
    The Vesper Bike is moving on road
    The Vesper Bike arrives at destination


    This is a Boeing 737
    The Boeing 737 Aircraft taking off
    The Boeing 737 Aircraft is flying in the sky
    The Boeing 737 Aircraft landing


    This is a The Cruiser
    The Cruiser is setting sail
    The Cruiser is sailing on the sea
    The Cruiser is docking
 **/