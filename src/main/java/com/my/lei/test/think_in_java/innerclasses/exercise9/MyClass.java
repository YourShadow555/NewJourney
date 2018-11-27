package com.my.lei.test.think_in_java.innerclasses.exercise9;

interface MyInterface {
    void print();
}
public class MyClass {


    public MyInterface hahaha() {
        class Inner implements MyInterface {
            @Override
            public void print() {
                System.out.println("Hahahahahah");
            }
        }
        return new Inner();
    }

    public static void main(String[] args) {
        MyClass my = new MyClass();
        my.hahaha().print();
    }
}
