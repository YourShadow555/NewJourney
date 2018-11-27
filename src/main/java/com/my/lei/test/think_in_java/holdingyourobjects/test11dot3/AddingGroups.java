package com.my.lei.test.think_in_java.holdingyourobjects.test11dot3;

import java.util.*;

public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts = {6, 7, 8, 9, 10};
        collection.addAll(Arrays.asList(moreInts));
        Collections.addAll(collection, 11, 12, 13, 14, 15);
        Collections.addAll(collection, moreInts);
        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        list.set(1, 99);
        //list.add(21);
        //Runtime error Because the underlying array cannot be resized.


        List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());
        //Won't compile
        //List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());
        List<Snow> snow3 = new ArrayList<Snow>();
        Collections.addAll(snow3, new Light(), new Heavy());
        //Give a hint use an explicit type argument specification
        List<Snow> snow4 = Arrays.<Snow>asList(new Light(), new Heavy());
    }
}
class Snow{}
class Powder extends Snow{}
class Crusty extends Snow{}
class Slush extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
