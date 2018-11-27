package com.my.lei.test.think_in_java.exceptions.test12dot9;

class BaseballException extends Exception{}
class Foul extends BaseballException{}
class Strike extends BaseballException{}

abstract class Inning {
    public Inning() throws BaseballException{}
    public void event() throws BaseballException{}
    public abstract void atBat() throws Strike,Foul;
    public void walk(){}
}
class StormException extends Exception{}
class RainedOut extends StormException{}
class PopFoul extends Foul{}

interface Strom {
    void event() throws RainedOut;

    void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Strom {
    //Ok to add new exceptions for constructors, but you must deal with
    //the base constructor exceptions
    public StormyInning() throws RainedOut,BaseballException{}
    public StormyInning(String s) throws Foul,BaseballException{}
    //Regular methods must conform to base class
    //!void walk() throws PopFoul{} cannot compile
    //Interface CANNOT add exception to existing methods from the base class
//    public void event() throws BaseballException{}
    //If the method doesn't already exist in the base class, the exception is OK
    public void rainHard() throws RainedOut{}
    //You can choose to not throw any exceptions.
    //even if the base version dose
    public void event(){}
    //Overridden methods can throw inherited exceptions
    public void atBat() throws PopFoul{}
}
