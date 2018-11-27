package com.my.lei.test.think_in_java.holdingyourobjects.exercise4;

import java.util.*;

public class MovieNameGenerator {
    String[] characters = {
            "Grumpy", "Happy", "Sleepy", "Dopey", "Doc", "Sneezy",
            "Bashful", "Snow White", "Witch Queen", "Prince"
    };
    int next;
    public String next() {
        String r = characters[next];
        next = (next + 1) % characters.length;
        return r;
    }
}
class test{
    private static final MovieNameGenerator mng =
            new MovieNameGenerator();
    static String[] fill(String[] array) {
        for(int i = 0; i < array.length; i++)
            array[i] = mng.next();
        return array;
    }
    static Collection<String>
    fill(Collection<String> collection) {
        for(int i = 0; i < 5; i++)
            collection.add(mng.next());
        return collection;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fill(new String[5])));
        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new LinkedList<String>()));
        System.out.println(fill(new HashSet<String>()));
        System.out.println(fill(new LinkedHashSet<String>()));
        System.out.println(fill(new TreeSet<String>()));
    }
}
