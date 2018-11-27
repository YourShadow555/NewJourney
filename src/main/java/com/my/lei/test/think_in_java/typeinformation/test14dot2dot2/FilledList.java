package com.my.lei.test.think_in_java.typeinformation.test14dot2dot2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
class CountedInteger{
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        System.out.print("a");
        return Long.toString(id);
    }
}
public class FilledList<T> {
    private Class<T> type;
    public FilledList(Class<T> type) {
        this.type = type;
    }

    public List<T> create(int nElements) {
        List<T> result = new ArrayList<>();
        try {
            for (int i = 0; i < nElements; i++) {
                result.add(type.newInstance());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {
//        FilledList<CountedInteger> fl = new FilledList<>(CountedInteger.class);
//        System.out.println(fl.create(15));

        try {
            Class<?> c = Class.forName("com.my.lei.test.think_in_java.typeinformation.test14dot2dot2.CountedInteger");
            Method[] m = c.getMethods();
            for (Method mm : m) {
                System.out.println(mm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
