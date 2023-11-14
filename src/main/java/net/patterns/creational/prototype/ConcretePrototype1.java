package net.patterns.creational.prototype;

public class ConcretePrototype1 implements CloneableInterface {
    private int field;

    public ConcretePrototype1(int field) {
        this.field = field;
    }

    @Override
    public CloneableInterface clone() {
        return new ConcretePrototype1(this.field);
    }

    public int getField() {
        return field;
    }

    public void setField(int field) {
        this.field = field;
    }
}
