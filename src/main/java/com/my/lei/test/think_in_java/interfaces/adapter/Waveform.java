package com.my.lei.test.think_in_java.interfaces.adapter;

public class Waveform {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Waveform "+ id;
    }
}
