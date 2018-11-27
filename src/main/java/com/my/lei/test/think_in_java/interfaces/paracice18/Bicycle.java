package com.my.lei.test.think_in_java.interfaces.paracice18;

public class Bicycle implements Cycle {

    private String name;

    public Bicycle() {
        this.name = this.getClass().getSimpleName();
    }

    @Override
    public void move() {
        System.out.println(name + "moved");
    }
}
