package net.patterns.creational.builder;

public class Director {
    private HorseBuilder horseBuilder;

    public Director() {
        this.horseBuilder = new HorseBuilder();
    }

    public Horse getHorse1() {
        return horseBuilder
                .setName("Алмаз")
                .setAge(12)
                .setBreed("Riding horse")
                .build();
    }

    public Horse getHorse2() {
        return horseBuilder
                .setName("Баратуста")
                .setAge(20)
                .setBreed("Przewalski's horse")
                .build();
    }
}
