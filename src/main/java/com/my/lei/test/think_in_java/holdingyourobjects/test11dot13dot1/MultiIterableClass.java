package com.my.lei.test.think_in_java.holdingyourobjects.test11dot13dot1;

import java.util.*;

public class MultiIterableClass extends IterableClass {
    public Iterable<String> reversed(){
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    int current = words.length;
                    @Override
                    public boolean hasNext() {
                        return current>-1;
                    }

                    @Override
                    public String next() {
                        return words[current--];
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }


    public Iterable<String> randomize(){
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                List<String> shuffled = new ArrayList<String>(Arrays.asList(words));
                Collections.shuffle(shuffled,new Random(47));
                return shuffled.iterator();
            }
        };
    }

}
