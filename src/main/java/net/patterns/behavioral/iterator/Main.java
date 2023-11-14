package net.patterns.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        String[] elements = {"One", "Two", "Three", "Four", "Five"};
        Aggregate aggregate = new ConcreteAggregate(elements);
        Iterator<String> iterator = aggregate.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
