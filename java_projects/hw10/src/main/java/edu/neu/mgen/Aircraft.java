package edu.neu.mgen;

public class Aircraft extends Vehicle {
    private int maxAltitude;

    public Aircraft(String name, String color, int maxAltitude) {
        super(name, color);
        this.maxAltitude = maxAltitude;
    }

    @Override
    public void start() {
        System.out.println("The " + name + " Aircraft taking off");
    }

    @Override
    public void stop() {
        System.out.println("The " + name + " Aircraft landing");
    }

    @Override
    public void move() {
        System.out.println("The " + name + " Aircraft is flying in the sky");
    }
}
