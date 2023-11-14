package net.patterns.structural.flyweight;

class ConcreteFlyweight implements Flyweight {
    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String extrinsicState) {
        System.out.println("ConcreteFlyweight with Intrinsic State: " + intrinsicState +
                " and Extrinsic State: " + extrinsicState);
    }
}
