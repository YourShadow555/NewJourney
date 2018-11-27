package com.my.lei.test.think_in_java.innerclasses.practice1;

public class Outer {

    private String content;

    public Outer(String content) {
        this.content = content;
    }

    public Inner getInner(){
        return new Inner();
    }

    class Inner{
//        {
//            System.out.println("Inner created");
//        }

        @Override
        public String toString() {
            return content;
        }
    }

    public static void main(String[] args) {
        Outer.Inner inner = new Outer("I love u baby").getInner();
        System.out.println(inner);
    }
}
