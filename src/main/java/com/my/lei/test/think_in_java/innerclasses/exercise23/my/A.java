package com.my.lei.test.think_in_java.innerclasses.exercise23.my;

public class A {

    public U getU(final String parameter) {
        return new U() {
            private String test = parameter;
            @Override
            public void method1() {
                System.out.println("method1 in A inner");
                System.out.println(test);
            }

            @Override
            public void method2() {
                System.out.println("method2 in A inner");
            }

            @Override
            public void method3() {
                System.out.println("method3 in A inner");
            }
        };
    }
}
