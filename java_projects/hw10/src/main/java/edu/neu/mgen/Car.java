package edu.neu.mgen;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String name, String color, int numberOfDoors) {
        super(name, color);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void start() {
        System.out.println("The " + name + " started from home");
    }

    @Override
    public void stop() {
        System.out.println("The " + name + " stopped at destination");
    }

    @Override
    public void move() {
        System.out.println("The " + name + " is moving on road");
    }
}
