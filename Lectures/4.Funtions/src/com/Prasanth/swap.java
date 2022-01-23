package com.Prasanth;

public class swap {
    public static void main(String[] args) {
        int a = 10 , b = 20;
        int temp;

         Swap(a,b);
        System.out.println( a + " " +b);

        String name = " Prasanth Balu";
        changeName(name);
        System.out.println( name);

    }
    static  void  changeName ( String name )
    {
        name = " Praveen Raj";
    }
    static  int  Swap(int a,int b)
    {
        int temp = a;
        a = b;
        b = temp; // only be vaild in function scope only
        return temp;
    }
}
