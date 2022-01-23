package com.Prasanth;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "PRasanth ";
        {
             a = 8; // reaasign the original value
             int c = 99;
             // values initiailized in the block will remain the  block

            name = " Balu";

        }
        System.out.println(a);
        int c = 109;
         System.out.println(c); // cannot use outside the block
        System.out.println( "Name = " + name);

        //Scoping in for loop
        for (int i = 0; i <4 ; i++) {
            System.out.println( i);
            int num  =67;

        }

    }

}
