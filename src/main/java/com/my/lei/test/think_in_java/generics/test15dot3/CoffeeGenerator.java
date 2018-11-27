package com.my.lei.test.think_in_java.generics.test15dot3;

import com.my.lei.test.think_in_java.interfaces.RandomDoubles;

import java.util.Iterator;
import java.util.Random;

interface Generator<T>{
    T next();
}
class Coffee{
    private static long counter = 0;
    private final long id = counter++;

    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}

class Latte extends Coffee {}
class Mocha extends Coffee {}
class Cappuccino extends Coffee {}
class Americano extends Coffee {}
class Breve extends Coffee {}
public class CoffeeGenerator implements Generator<Coffee>,Iterable<Coffee>  {
    private Class[] types = {Latte.class,Mocha.class,Cappuccino.class,Americano.class,Breve.class};

    private static Random rand = new Random();
    public CoffeeGenerator(){}

    private int size = 0;

    public CoffeeGenerator(int sz){
        this.size = sz;
    }



    @Override
    public Coffee next() {
        try {
            return (Coffee) types[rand.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;
        public boolean hasNext(){
            return count > 0;
        }

        public Coffee next(){
            count--;
            return CoffeeGenerator.this.next();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }


    public static void main(String[] args) {
        CoffeeGenerator gen = new CoffeeGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
        for (Coffee c : new CoffeeGenerator(5)) {
            System.out.println(c);
        }
    }
}
