package com.my.lei.test.think_in_java.innerclasses.exercise7;

public class Answers {
    private int i = 10;
    private void f() {
        System.out.println("Answers.f");
    }
    class Inner {
        void g() {
            i++;
            f();
        }
    }
    public void h() {
        Inner in = new Inner();
        in.g();
        System.out.println("i = " + i);
    }
    public static void main(String args[]) {
        Answers ica = new Answers();
        ica.h();
    }
}
