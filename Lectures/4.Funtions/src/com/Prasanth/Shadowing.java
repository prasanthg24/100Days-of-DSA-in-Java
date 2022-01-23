package com.Prasanth;

public class Shadowing {
    static  int x =10; // this wil  be shadowing at  line 10
    public static void main(String[] args) {


        System.out.println( x);
        int x ; //class variable
        //System.out.println(x);
        x=40;
        System.out.println(x);
        fun();

    }

   static void fun() {

       System.out.println(x);
    }
}
