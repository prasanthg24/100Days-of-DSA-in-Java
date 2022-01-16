package com.Prasanth.Assignment2;

import java.util.Scanner;

public class NprNcr {
    public static void main(String[] args) {

         // Formula = //nPr = n!/(n-r)!
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the n value = ");
        int n = input.nextInt();
        System.out.print("Enter the r value = ");
        int r = input.nextInt();
        int factn = 1;

        for (int i = 1; i <=n; i++) {
            factn = factn * i;
        }

        double  temp = factn;

       int  factnr = 1;
        for (int i = 1; i <=n-r; i++) {
            factnr = factnr * i;
        }

        double npr = temp /factnr;
        int factr = 1;
        for (int i = 1; i <=r; i++) {
            factr = factr * i;
        }

        double ncr = temp / (factr*factnr);

        System.out.println( "npr = " + npr);
        System.out.println( "ncr = " + ncr);
    }
}
