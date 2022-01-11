package com.Assignment;

import java.util.*;
public class FibonacciSeries {
    public static void main(String [] args )
    {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter the range - ");
        int range = input.nextInt();
        int a = 0,b =1 ,c = 0;
         System.out.println(a);
         System.out.println(b);
         for( int i = 2; i<range ; i++)
         {
             c = a+b;
             System.out.println( c );
             a = b;
             b = c;

         }
       // System.out.println( c );


    }
}
