package org.DataTypes;

//TypeCasting is the process of converting one data type to another, implicitly(Widening) or explicitly(Narrowing)
public class TypeCasting {
    public static void main(String[] args) {
        //Widening- No data loss, safer
        //order: byte → short → int → long → float → double
        int a = 10;
        double b = a;
        System.out.println("b:" +b);

        //Narrowing -  Data loss
        double d = 1.5;
        //int  y = d; -  this line gives error as lossy conversion from double to int
        int y = (int) d;
        System.out.println("y:" +y);//fractional part .5 will be lost so only we need to mention explicitly for Java

        //Overflow example
        int x = 130;
        byte z = (byte) x;   // -126
        System.out.println("z:" +z);

    }
}
