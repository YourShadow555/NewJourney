package com.my.lei.test.think_in_java.interfaces.adapter;

public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }
    public Waveform process(Waveform input) {
        return input;
    }
}