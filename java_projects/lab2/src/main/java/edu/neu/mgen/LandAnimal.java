package edu.neu.mgen;

public class LandAnimal extends Animals {
    private int numberOfLegs;

    public LandAnimal(String name, double weight, double size, boolean isPredator, int numberOfLegs) {
        super(name, weight, size, isPredator);
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void makeSound() {
        System.out.println("Roaring sound");
    }

    @Override
    public void move() {
        System.out.println("Walking on land");
    }
}
