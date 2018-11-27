package com.my.lei.test.think_in_java.interfaces;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class RandomDoubleAdapter extends RandomDoubles implements Readable {
    private int count;

    public RandomDoubleAdapter(int count) {
        this.count = count;
    }



    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }
        //why must add " "  why " " is necessary
        String s = Double.toString(next()) + " ";
        System.out.println("test::::>"+s);
        cb.append(s);
        return s.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new RandomDoubleAdapter(7));
        while (scanner.hasNextDouble()) {
            System.out.println(scanner.nextDouble());
        }
    }
}
