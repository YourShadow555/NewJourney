package com.my.lei.test.think_in_java.interfaces.paracice18;

public class Tricycle implements Cycle {
    private String name;

    public Tricycle() {
        this.name = this.getClass().getSimpleName();
    }

    @Override
    public void move() {
        System.out.println(name + "moved");
    }
}
