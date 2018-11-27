package com.my.lei.test.think_in_java.interfaces.adapter;

public class CharacterPairSwapperAdapter implements Processor {


    @Override
    public String name() {
        return CharacterPairSwapper.class.getSimpleName();
    }

    @Override
    public Object process(Object input) {
        return CharacterPairSwapper.swap(input.toString());
    }


    public static void main(String[] args) {
        String s = "The longer you have to wait for something,the more you will appreciate it when it finally arrives!";
        Apply.process(new CharacterPairSwapperAdapter(),s);
    }
}
