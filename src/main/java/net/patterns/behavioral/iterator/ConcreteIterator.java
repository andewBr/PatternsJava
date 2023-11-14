package net.patterns.behavioral.iterator;

class ConcreteIterator implements Iterator<String> {
    private String[] elements;
    private int position = 0;

    ConcreteIterator(String[] elements) {
        this.elements = elements;
    }

    public boolean hasNext() {
        return position < elements.length && elements[position] != null;
    }

    public String next() {
        String element = elements[position];
        position++;
        return element;
    }
}
