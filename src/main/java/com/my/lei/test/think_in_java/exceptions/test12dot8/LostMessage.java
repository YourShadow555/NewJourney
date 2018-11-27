package com.my.lei.test.think_in_java.exceptions.test12dot8;
class VeryImportantException extends Exception{
    @Override
    public String toString() {
        return "A very important exception";
    }
}

class HoHumException extends Exception {
    @Override
    public String toString() {
        return "A trivial Exception";
    }
}
public class LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }
    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        LostMessage lm = new LostMessage();
        try {
            try {
                lm.f();
            } finally {
                lm.dispose();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


class ExceptionSilencer {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        }finally {
            return;
        }
    }
}