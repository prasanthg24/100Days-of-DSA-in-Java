package com.Assignment;
import java.util.*;
public class MaxNumberFromall {
    public static void main(String [] args )
    {
        Scanner input = new Scanner (System.in );
        //int n = input.nextInt();
        int max  = 0;
        while (true)
        {
            System.out.print( "Enter the value = ");
            int n = input.nextInt();
            if (n == 0)
            {
                break;
            }
            else
            {

                if(n>max)
                {
                    max = n;
                }
            }
        }
        System.out.println( "Largest Value  = "+ max);
    }

}
