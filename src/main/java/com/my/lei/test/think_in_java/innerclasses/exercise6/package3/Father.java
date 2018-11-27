package com.my.lei.test.think_in_java.innerclasses.exercise6.package3;

import com.my.lei.test.think_in_java.innerclasses.exercise6.package1.Sweep;
import com.my.lei.test.think_in_java.innerclasses.exercise6.package2.Outer;

public class Father extends Outer {


    public Sweep getInner() {
        Father f = new Father();
        Sweep sweep = f.getInner();
        return sweep;
    }
}
