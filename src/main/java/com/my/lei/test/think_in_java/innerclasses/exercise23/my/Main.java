package com.my.lei.test.think_in_java.innerclasses.exercise23.my;

public class Main {
    public static void main(String[] args) {
        //A.getU("intellectual").method1();
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        A a4 = new A();
        A a5 = new A();

        B b = new B(5);
        b.add(a1.getU("a1"));
        b.add(a2.getU("a2"));
        b.add(a3.getU("a3"));
        b.add(a4.getU("a4"));
        b.add(a5.getU("a5"));

        b.callMethods();


        Main main = new Main();
        main.new Inner().say();


    }



    class Inner{
        public void say() {
            System.out.println(Main.this.getClass().getSimpleName());
        }
    }
}
