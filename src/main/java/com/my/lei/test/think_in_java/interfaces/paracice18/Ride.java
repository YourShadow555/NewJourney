package com.my.lei.test.think_in_java.interfaces.paracice18;

public class Ride {

    public static void run(CycleFactory cycleFactory){
        cycleFactory.move();
    }


    public static void main(String[] args) {
        run(new CycleFactory(new Bicycle()));
        run(new CycleFactory(new Unicycle()));
        run(new CycleFactory(new Tricycle()));
    }
}
