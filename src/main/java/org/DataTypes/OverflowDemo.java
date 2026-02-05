package org.DataTypes;

public class OverflowDemo {
    public static void main(String[] args) {


        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;


        System.out.println("Max int value: " + max);
        System.out.println("After overflow 1 : " + (max +1));
        System.out.println("After overflow 2 : " + (max +10));


        System.out.println("Min int value: " + min);
        System.out.println("After overflow: " + (min -1));


//When the range is exceeding, Java does not throw exception but instead it is wrapped around the minimum value.
        //this is called as overflow/underflow


        //Java Int use fixed 32 bit 2s complement.
        //when operation exceeds max representation value then the extra carry is discarded and
        //the bits are wrap around, resulting in overflow
    }


}
