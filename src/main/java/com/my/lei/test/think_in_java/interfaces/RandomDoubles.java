package com.my.lei.test.think_in_java.interfaces;

import java.util.Random;

public class RandomDoubles {
    private static Random random = new Random(47);
    public double next() {
        return random.nextDouble();
    }

    public static void main(String[] args) {
        RandomDoubles randomDoubles = new RandomDoubles();
        for (int i = 0; i < 7; i++) {
            System.out.println(randomDoubles.next()+ "\n");
        }
    }
}
