package com.my.lei.test.think_in_java.innerclasses.test10dot6;

public class Test10 {
    public Wrapping wrapping(int x) {
        return new Wrapping(x){
            public int value(){
                /**
                 * super.value()
                 */
                return super.value() * 47;
            }
        };
    }

    public static void main(String[] args) {
       // System.out.println(new Test10().wrapping(10).value());
        Test10 t10 = new Test10();
        System.out.println(t10.destination("duck").readLabel());
    }

    public Destination destination(final String dusk){
        return new Destination(){
            private String label = dusk;
            public String readLabel(){
                return label;
            }
        };
    }
}
