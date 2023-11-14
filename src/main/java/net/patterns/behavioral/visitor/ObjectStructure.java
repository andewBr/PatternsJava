package net.patterns.behavioral.visitor;

class ObjectStructure {
    private Element[] elements;

    ObjectStructure(Element... elements) {
        this.elements = elements;
    }

    void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}

