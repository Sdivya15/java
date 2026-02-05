package org.DataTypes;

public class Basic {

    static byte b;//sdefault value 0
    static int i;//default value 0
    static short s;//default value 0
    static float f;//default value 0.0
    static double d;//default value 0.0
    static char c;//default value 0=\u0000
    static boolean bool;//default value false


    public static void main(String[] args) {
        System.out.println("Byte: " + b);
        System.out.println("int: " + i);
        System.out.println("short: " + s);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);


        //--------------------------------------------------------------------//


        System.out.println("Byte Range: "+Byte.MIN_VALUE+" to "+Byte.MAX_VALUE);
        System.out.println("int Range: "+Integer.MIN_VALUE+" to "+Integer.MAX_VALUE);
        System.out.println("Short Range: "+Short.MIN_VALUE+" to "+Short.MAX_VALUE);
        System.out.println("Float Range: "+Float.MIN_VALUE+" to "+Float.MAX_VALUE);
        System.out.println("Double Range: "+Double.MIN_VALUE+" to "+Double.MAX_VALUE);
        System.out.println("Char Range: "+Character.MIN_VALUE+" to  "+Character.MAX_VALUE);


    }
}
//Class is loaded by the class Loader.
//Static var are created in method area so JVM will assign values automatically
//main() executes and prints those values


//char in Java have 2 byte because it uses Unicode(all lang) and not ASCII(eng - centric)
//If Java is ASCII then it will tough to handle emojis, Strings and it wont be as WORA.

//  instance/static variables live in memory and are auto-initialized by the JVM, while local variables live on the stack and must be explicitly initialized by the programmer.
