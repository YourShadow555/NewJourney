package com.my.lei.test.think_in_java.holdingyourobjects.test11dot13dot1;

import java.util.*;

public class ReversibleArrayList<T> extends ArrayList<T> {
    public ReversibleArrayList(Collection<T> c){
        super(c);
    }
    public Iterable<T> reversed(){
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int current = size() - 1;
                    public boolean hasNext(){return current>-1;}
                    public T next(){return get(current--);}
                    public void remove(){
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}
class AdapterMethod{
    public static void main(String[] args) {
        ReversibleArrayList<String> ral = new ReversibleArrayList<String>(Arrays.asList("To be or not to be".split(" ")));
        for (String s : ral) {
            System.out.print(s + " ");
        }
        System.out.println();
        Iterable<String> its = ral.reversed();
        for (String s : its) {
            System.out.print(s + " ");
        }
    }
}
