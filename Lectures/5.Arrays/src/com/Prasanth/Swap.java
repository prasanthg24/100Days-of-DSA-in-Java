package com.Prasanth;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args)
    {
        int[] arr = { 2,3,4,6,5,9};
        // swapfun(arr,0,4);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

        static  void reverse(int [] arr )
        {
            int start = 0;
            int end = arr.length -1 ;
            while(start < end )
            {
                swapfun(arr ,start , end);
                start ++ ;
                end --;
            }
        }


     static void swapfun(int[] arr, int index1, int index2 )
     {

         int temp = arr[index1];
         arr[index1] = arr[index2];
         arr[index2] = temp;
     }
}
