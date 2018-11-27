package com.my.lei.test.think_in_java.interfaces;

public class NestingInterfaces {
    public class BImp implements A.B{
        @Override
        public void f() {

        }
    }

    class CImp implements A.C{
        @Override
        public void f() {

        }
    }

    //Cannot implements a private interface except within that interface's
    //defining class;
//    class DImp implements A.D{
//        @Override
//        public void f() {
//
//        }
//    }
    class EImp implements E {
        @Override
        public void g() {

        }
    }

    class EGImp implements E.G {
        @Override
        public void f() {

        }
    }

    class EGImp2 implements E{
        public void g() {

        }
       class EG implements E.G{
           @Override
           public void f() {

           }
       }
    }

    public static void main(String[] args) {
        A a = new A();
        //Cannot access A.D
        //A.D ad = a.getD();
        //Doesn't return anything but A.D
        //A.DImp2 di2 = a.getD();
        //Cannot assess a member of the interface
        //a.getD().f();
        // Only another A can do anything with getD()
        A a2 = new A();
        a2.receiveD(a.getD());


//        A.DImp2 adi = new A.DImp2();

    }

}
class A {
    interface B {
        void f();
    }

    public class BImp implements B{
        @Override
        public void f() {

        }
    }

    public class BImp2 implements B {
        @Override
        public void f() {

        }
    }

    public interface C{
        void f();
    }

    class CImp implements C{
        @Override
        public void f() {

        }
    }

    private class CImp2 implements C{
        @Override
        public void f() {

        }
    }

    private interface D{
        void f();
    }

    private class DImp implements D {
        @Override
        public void f() {

        }
    }

    public class DImp2 implements D{
        @Override
        public void f() {

        }
    }
    //但是,A.DImp2只能被其自身使用.你无法说它实现了一个private接口D.因此,实现了一个private接口只是一种方式,
    //它可以强制该接口中的方法定义不要添加任何类型信息(也就是说,不允许向上转型)

    public D getD() {
        return new DImp2();
    }

    private D dref;

    public void receiveD(D d) {
        dref = d;
        dref.f();
    }

}

interface E {
    interface G {
        void f();
    }

    public interface H {
        void f();
    }

    void g();

    //Cann't be private within an interface
    //private interface I{}


}
