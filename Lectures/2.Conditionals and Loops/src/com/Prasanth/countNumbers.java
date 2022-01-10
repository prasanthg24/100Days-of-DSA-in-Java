package com.Prasanth;

import java.util.Scanner;

public class countNumbers {
    public static void main(String[] args) {

        Scanner input  = new Scanner( System.in);
        int n = input.nextInt();
        int check = input.nextInt();
        int rem,sum = 0;
        while (n > 0)
        {
            rem = n % 10;
            if(rem == check){
                sum = sum +1;
            }
            n = n/10;
        }
        System.out.println( "count of "+ check+ "  is " + sum);
    }
}
