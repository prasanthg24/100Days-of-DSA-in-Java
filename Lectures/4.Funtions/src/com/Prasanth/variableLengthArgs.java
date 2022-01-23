package com.Prasanth;

import java.util.Arrays;

public class variableLengthArgs {
    public static void main(String[] args)
    {
        fun(1,2,3,444,55,322,66,77,88);
        multiple( 2 ,3 , "Prasanth ","Rajeswari");
    }
    static  void fun( int ...v) // array of int or string based on datatype
    {
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a , int b, String ...v) // variable argument only allow at end
    {
        System.out.println( a + " "+ b);
        System.out.println( Arrays.toString(v));

    }
}
