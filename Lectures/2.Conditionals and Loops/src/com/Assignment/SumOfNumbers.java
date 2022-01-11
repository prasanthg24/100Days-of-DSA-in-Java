package com.Assignment;

import java.util.*;
public class SumOfNumbers {

    public static void main(String [] args )
    {
        Scanner input  = new Scanner( System.in );

        int sum = 0 ;
        while(true)
        {
            System.out.print( "Enter the value to sum = ");
            int n  = input.nextInt();
            if ( n == 0)
            {
                break;
            }
            else
            {
                 sum  += n ;
            }
        }
        System.out.print("Sum = "+sum);

    }
}
