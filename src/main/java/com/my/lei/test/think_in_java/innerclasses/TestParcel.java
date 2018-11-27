package com.my.lei.test.think_in_java.innerclasses;

import sun.security.krb5.internal.crypto.Des;
import sun.swing.plaf.synth.DefaultSynthStyle;

interface Contents{
    int value();
}
interface Destination{
    String readLable();
}
class Parcle{
    private class PContents implements Contents{
        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }
    protected class PDestination implements Destination{
        private String lable;

        private PDestination(String whereTo) {
            lable = whereTo;
        }
        @Override
        public String readLable() {
            return lable;
        }
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contents contents() {
        return new PContents();
    }
}
public class TestParcel {
    public static void main(String[] args) {
        Parcle p = new Parcle();
        Contents c = p.contents();
        Destination d = p.destination("Tasmania");

        //Parcle.PDestination ppd = p.new Parcle.PDestination("");
    }
}
