package com.my.lei.test.think_in_java.innerclasses.exercise11;

public class Ground {
    private class Teen implements Love {
        @Override
        public void hug() {
            System.out.println("Teenager hug");
        }



    }
    public Love getTeen() {
        return new Teen();
    }

    public Teen getTeen2() {
        return new Teen();
    }


}
class test{
    public static void main(String[] args) {
        Ground g = new Ground();
        Love love = g.getTeen();

        //Teen t = g.getTeen2();
    }
}
