package edu.neu.mgen;

public class Ship extends Vehicle {
    private int maxCapacity;

    public Ship(String name, String color, int maxCapacity) {
        super(name, color);
        this.maxCapacity = maxCapacity;
    }

    @Override
    public void start() {
        System.out.println(name + " is setting sail");
    }

    @Override
    public void stop() {
        System.out.println(name + " is docking");
    }

    @Override
    public void move() {
        System.out.println(name + " is sailing on the sea");
    }
}
