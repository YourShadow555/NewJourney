package com.my.lei.test.think_in_java.innerclasses.exercise7;

public class MyTest {
    private String name;

    public MyTest(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }


    public void change() {
        MyTest me = new MyTest("invoker");
        System.out.println("before change");
        System.out.println(me.getName());
        ChangeMe change = new ChangeMe();
        change.addPrefix();
        System.out.println("after change");
        System.out.println(me.getName());
    }


    public static void main(String[] args) {
        new MyTest("123").change();
    }


    class ChangeMe {

        public void setName(String me) {
            name = me;
        }

        public void addPrefix(){
            name = "========>" + getName();
        }


    }
}
