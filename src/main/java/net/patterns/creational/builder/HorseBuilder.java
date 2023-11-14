package net.patterns.creational.builder;

public class HorseBuilder {
    private Horse horse;

    public HorseBuilder() {
        this.horse = new Horse();
    }

    public HorseBuilder setName(String name) {
        this.horse.setName(name);
        return this;
    }

    public HorseBuilder setAge(int age) {
        this.horse.setAge(age);
        return this;
    }

    public HorseBuilder setBreed(String breed) {
        this.horse.setBreed(breed);
        return this;
    }

    public Horse build() {
        return horse;
    }

    @Override
    public String toString() {
        return "HorseBuilder{" +
                "horse=" + horse +
                '}';
    }
}
