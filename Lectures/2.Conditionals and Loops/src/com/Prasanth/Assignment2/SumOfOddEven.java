package com.Prasanth.Assignment2;

import java.util.Scanner;

public class SumOfOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int negtive = 0 , even = 0 ,odd = 0;
        while (true)
        {
            System.out.println("Enter the value");
            int n = input.nextInt();
            if (n < 0)
            {
                negtive = negtive + n ;
            }
            if (n > 0 && n % 2 != 0)
            {
                odd = odd + n;
            }
            if (n%2 == 0)
            {
                even = even + n ;
            }
            if ( n == 0)
            {
                break;
            }
        }

        System.out.println( " Sum of Negative Number = " + negtive);
        System.out.println( " Sum of Odd Number = " + odd);
        System.out.println( " Sum of Even Number = " + even);
    }
}
