package com.Prasanth.Assignment2;

import java.util.Scanner;

public class LcmAndHcf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n1 value = ");
        int n1 = input.nextInt();

        System.out.print("Enter n2 value = ");
        int n2 = input.nextInt();
        int hcf = 0;
        for (int i = 1; i <=n1 && i <= n2 ; i++) {


            if ( (n1%i == 0) && (n2%i == 0) )
            {
                hcf = i;
            }

        }
        System.out.println( " HCF = " + hcf);

        int lcm;
        lcm = n1*n2/hcf;

        System.out.println( "LCM = " + lcm);
    }
}
