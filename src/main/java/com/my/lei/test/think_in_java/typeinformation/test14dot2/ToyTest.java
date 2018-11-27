package com.my.lei.test.think_in_java.typeinformation.test14dot2;

import com.my.lei.test.think_in_java.innerclasses.exercise6.package3.Father;

interface HasBatteries{}
interface Waterproof{}
interface Shoots{}
class Toy{
    //Comment out the following default constructor
    //to see NoSuchMethodError from (*1*)
    //Toy(){}
    Toy(int i){}
}

class GenericToyTest{
    public static void main(String[] args) throws Exception{
        Class<FancyToy> ftClass = FancyToy.class;
        FancyToy fancyToy = ftClass.newInstance();
        Class<? super FancyToy> up = ftClass.getSuperclass();
        //this won't compile
        //Class<Toy> up2 = ftClass.getSuperclass();
        //Only produces Object
        Object obj = up.newInstance();
    }
}


class FancyToy extends Toy implements HasBatteries,Waterproof,Shoots{
    FancyToy() {
        super(1);
    }
}
public class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Class name: " + cc.getName() + " is interface?[" + cc.isInterface() + "]");
        System.out.println("Simple name : " + cc.getSimpleName());
        System.out.println("Canonical name : " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        /*Class c = null;
        try {
            c = Class.forName("com.my.lei.test.think_in_java.typeinformation.test14dot2.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Cannot found FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces())
            System.out.println(face);
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            //Requires default constructor:
            obj = up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Cannot instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Cannot access");
            System.exit(1);
        }
        System.out.println(obj.getClass());*/

        int[] a = twoSum(new int[]{3, 3}, 6);
        for (int b : a) {
            System.out.println(b);
        }
    }



    public static int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        for(int j=0;j<nums.length;j++){
            for(int i=1;i<nums.length;i++){
                if((nums[j]+nums[i])==target&&i!=j){
                    result[0]=j;
                    result[1]=i;
                    return result;
                }
            }
        }
        return result;
    }
}
