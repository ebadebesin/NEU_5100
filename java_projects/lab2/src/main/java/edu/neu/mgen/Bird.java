package edu.neu.mgen;

public class Bird extends Animals {
    private String species;
    private double wingspan;

    public Bird(String name, double weight, double size, boolean isPredator, String species, double wingspan) {
        super(name, weight, size, isPredator);
        this.species = species;
        this.wingspan = wingspan;
    }

    @Override
    public void makeSound() {
        System.out.println("Chirping sound");
    }

    @Override
    public void move() {
        System.out.println("Flying through the sky");
    }

}
