package com.my.lei.test.think_in_java.interfaces.adapter;

public class Apply {
    public static void process(Processor processor, Object o) {
        System.out.println("Using Processor " + processor.name());
        System.out.println(processor.process(o));
    }
}
