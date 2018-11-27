package com.my.lei.test.think_in_java.innerclasses.exercise23.my;

public class B {
    U[] ua;

    public B(Integer size) {
        ua = new U[size];
    }

    public boolean add(U elem) {
        for(int i = 0; i < ua.length; i++) {
            if(ua[i] == null) {
                ua[i] = elem;
                return true;
            }
        }
        return false; // Couldn't find any space
    }

    public boolean setNull(int i) {
        if(i < 0 || i >= ua.length)
            return false; // Value out of bounds
        // (Normally throw an exception)
        ua[i] = null;
        return true;
    }

    public void callMethods() {
        for(int i = 0; i < ua.length; i++)
            if(ua[i] != null) {
                ua[i].method1();
                ua[i].method2();
                ua[i].method3();
            }
    }
}
