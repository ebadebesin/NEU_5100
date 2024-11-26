package edu.neu.mgen;

public abstract class Animals {
    protected String name;
    protected double weight;
    protected double size;
    protected boolean isPredator;

    public Animals(String name, double weight, double size, boolean isPredator) {
        this.name = name;
        this.weight = weight;
        this.size = size;
        this.isPredator = isPredator;
        
    }

    public abstract void makeSound();
    public abstract void move();
}
