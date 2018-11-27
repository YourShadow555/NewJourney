package com.my.lei.test.think_in_java.innerclasses.test10dot6;

public class Test11 {
    public Destination destination(final String dest,final float price) {
        return new Destination(){
            private int cost;
            {
                cost = Math.round(price);
                if (cost>100)
                    System.out.println("Over budget!");
            }

            private String label = dest;

            public String readLable() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Test11 test11 = new Test11();
        Destination d = test11.destination("Tasmania", 101.395f);
        System.out.println(d.readLabel());
    }
}
