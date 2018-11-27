package com.my.lei.test.think_in_java.interfaces.adapter;

/**
 * adapter model
 */
public class FilterAdapter implements Processor {
    Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Object process(Object input) {
        return filter.process((Waveform) input);
    }
}
