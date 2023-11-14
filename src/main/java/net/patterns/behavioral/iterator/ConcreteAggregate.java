package net.patterns.behavioral.iterator;

class ConcreteAggregate implements Aggregate {
    private String[] elements;

    ConcreteAggregate(String[] elements) {
        this.elements = elements;
    }

    public Iterator<String> createIterator() {
        return new ConcreteIterator(elements);
    }
}
