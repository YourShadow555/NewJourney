package com.my.lei.test.think_in_java.innerclasses.test10dot10;
class Egg{

    private Yolk y;
    protected class Yolk{
        public Yolk(){
            System.out.println("Egg.Yolk");
        }
    }

    public Egg() {
        System.out.println("New egg");
        y = new Yolk();
    }
}
public class BigEgg extends Egg {
    public class Yolk{
        public Yolk() {
            System.out.println("BigEgg.Yolk");
        }
    }

    public BigEgg() {

    }

    public static void main(String[] args) {
        new BigEgg();
    }
}
