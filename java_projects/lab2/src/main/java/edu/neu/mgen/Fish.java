package edu.neu.mgen;

public class Fish extends Animals{
    private int numberOfFins;

    public Fish(String name, double weight, double size, boolean isPredator, int numberOfFins) {
        super(name, weight, size, isPredator);
        this.numberOfFins = numberOfFins;
    }

    @Override
    public void makeSound() {
        System.out.println("Gurgling sound");
    }

    @Override
    public void move() {
        System.out.println("Swimming in water");
    }
}
