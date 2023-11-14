package net.patterns.behavioral.visitor;

interface Element {
    void accept(Visitor visitor);
}
