package com.Prasanth.Assignment2;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value = ");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {

            if(n%i == 0)
            {
                sum = sum + i;
            }
        }
        if (sum == n)
        {
            System.out.println("Perfect Number ");
        }
        else
        {
            System.out.println("Not a Perfect Number");
        }
    }
}

