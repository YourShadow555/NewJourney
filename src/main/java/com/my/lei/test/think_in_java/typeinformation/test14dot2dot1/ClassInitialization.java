package com.my.lei.test.think_in_java.typeinformation.test14dot2dot1;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Random;

class Initable{
    static final int staticFinal = 47;
    static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
    static {
        System.out.println("Initializing Initable");
    }
}
class Initable2{
    static int staticNonFinal = 147;
    static {
        System.out.println("Initializing Initable2");
    }
}
class Initable3{
    static int staticNonFinal = 74;
    static {
        System.out.println("Initializing Initable3");
    }
}

public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) throws Exception {
//        Boolean.TYPE
//        int.class
        //Class<Number> genericNumberClass = int.class;
        Class<? extends Number> genericNumberClass = int.class;
        genericNumberClass = double.class;

        Class initable = Initable.class;
        System.out.println("After creating Initable ref");
        System.out.println(Initable.staticFinal);
        System.out.println(Initable.staticFinal2);
        System.out.println(Initable2.staticNonFinal);
        Class initable3 = Class.forName("com.my.lei.test.think_in_java.typeinformation.test14dot2dot1.Initable3");
        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticNonFinal);
    }
}
