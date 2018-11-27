package com.my.lei.test.think_in_java.innerclasses.exercise6.package2;

import com.my.lei.test.think_in_java.innerclasses.exercise6.package1.Sweep;

public class Outer {

    public Sweep get() {
        return new Inner();
    }

    protected class Inner implements Sweep {
        @Override
        public void weep() {
            System.out.println("weep");
        }
    }
}
