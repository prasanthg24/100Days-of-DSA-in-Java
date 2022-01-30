package com.Prasanth;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        // Array of primitives
        int [] arr = new int[5];
        arr[0] = 45;
        arr[1] = 15;
        arr[2] = 435;
        arr[3] = 54;
        arr[4] = 98;
        //System.out.println( arr[3]);

       Scanner input = new Scanner(System.in);
//        for (int  i = 0;  i < arr.length;  i++)
//        {
//            arr[i] = input.nextInt();
//        }
//        System.out.print( "Output = ");
////        for (int  i = 0;  i < arr.length;  i++)
////        {
////            System.out.print ( arr[i]);
////        }
//
////        for (int num: arr) // for every element in array print the element
////        {
////             System.out.print( num + " "); // here num represent element of the array
////        }
//
//
//        System.out.println(Arrays.toString(arr));


            //Array of object
        String[] str = new String[4];
        for (int i = 0 ; i< str.length ; i++)
        {
            str [i] =input.next();
        }

        System.out.println( Arrays.toString(str));
        //modify

        str[1] = " Prasanth ";
        System.out.println( Arrays.toString(str));











        }

    }

