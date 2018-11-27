package com.my.lei.test.think_in_java.interfaces.paracice18;

public class CycleFactory implements Cycle {

    private Cycle cycle;

    public CycleFactory(Cycle cycle) {
        this.cycle = cycle;
    }

    @Override
    public void move() {
        cycle.move();
    }
}
