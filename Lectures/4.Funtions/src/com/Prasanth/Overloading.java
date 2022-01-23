package com.Prasanth;

public class Overloading {
    public static void main(String[] args) {

        fun("Prasanth");
        fun(88);
    }
    static  void fun(String name)
    {
        System.out.println( " Name = " + name);
    }
    static void fun( int a)
    {
        System.out.println( a );
    }
}
