package com.my.lei.test.think_in_java.innerclasses.test10dot9;

class WithInner{
    class Inner{
        public Inner(String s) {
            System.out.println(s);
        }
    }
}

public class InheritInner extends WithInner.Inner {
    InheritInner(WithInner withInner,String s){
        withInner.super(s);
    }
}
