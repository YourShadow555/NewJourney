package com.my.lei.test.think_in_java.interfaces.parctice19;

public interface Game {
    void go();
}

interface GameFactory {
    Game getGame();
}

class Coin implements Game {

    private final int type=2;

    @Override
    public void go() {

    }
}