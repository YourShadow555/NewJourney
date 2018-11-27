package com.my.lei.test.think_in_java.strings.test13dot3;

import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion {
    @Override
    public String toString() {
        //return " InfiniteRecursion address: " + this + "\n";
        return " InfiniteRecursion address: " + super.toString() + "\n";
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
        for (int i = 0; i < 10; i++) {
            v.add(new InfiniteRecursion());
        }
        System.out.println(v);
    }
}
