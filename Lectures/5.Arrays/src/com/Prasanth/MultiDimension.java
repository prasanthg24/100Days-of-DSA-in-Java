package com.Prasanth;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
        1 2 3
        4 5 6
        7 8 9
        */

        int [] []arr = new  int [3][3];

        int [][] arr2  = {
                {1,2,3},//0th index
                {4,5}, //1st index
                {6,7,8,9} // 2nd index
        };
        //input
        Scanner input = new Scanner(System.in);
        for (int row = 0; row < arr.length; row++)
        {
            for (int col = 0; col <arr[row].length ; col++)
            {
                arr[row][col] = input.nextInt();
            }
        }
        //output
        System.out.println( "Ouput = ");
//        for (int row = 0; row < arr.length; row++)
//        {
//            for (int col = 0; col <arr[row].length ; col++)
//            {
//                System.out.print(arr[row][col] +" ");
//            }
//            System.out.println( );
//        }

//        for (int row = 0 ; row < arr.length;row++)
//        {
//            System.out.println( Arrays.toString( arr[row]));
//        }


        for (int[] a: arr)
        {
            System.out.println(Arrays.toString(a));
        }

    }
}
