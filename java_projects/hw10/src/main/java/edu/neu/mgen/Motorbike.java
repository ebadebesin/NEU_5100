package edu.neu.mgen;

public class Motorbike extends Vehicle {
    private boolean hasOnesit
    ;

    public Motorbike(String name, String color, boolean hasOnesit) {
        super(name, color);
        this.hasOnesit = hasOnesit;
    }

    @Override
    public void start() {
        System.out.println("The " + name + " left destination");
    }

    @Override
    public void stop() {
        System.out.println("The " + name + " arrives at destination");

    }

    @Override
    public void move() {
        System.out.println("The " + name + " is moving on road");
    }
}
