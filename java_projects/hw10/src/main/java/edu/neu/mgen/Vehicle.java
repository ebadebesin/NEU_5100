package edu.neu.mgen;

public abstract class Vehicle {
    protected String name;
    protected String color;

    public Vehicle(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract void start();
    public abstract void stop();
    public abstract void move();
}
