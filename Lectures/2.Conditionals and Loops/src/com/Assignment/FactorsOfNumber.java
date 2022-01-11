package com.Assignment;

import java.util.*;
public class FactorsOfNumber {
    public static void main(String []args )
    {
        Scanner input = new Scanner( System.in);
        System.out.print("Enter the value to find its factors = ");
        int n =input.nextInt();

        for (int i = 1 ; i <= n ; i++)
        {
            if( n % i == 0)
            {
                System.out.println( i );

            }
        }
    }

}
