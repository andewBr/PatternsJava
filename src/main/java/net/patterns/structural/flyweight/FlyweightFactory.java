package net.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

class FlyweightFactory {
    private Map<String, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(String key) {
        return flyweights.computeIfAbsent(key, ConcreteFlyweight::new);
    }
}
