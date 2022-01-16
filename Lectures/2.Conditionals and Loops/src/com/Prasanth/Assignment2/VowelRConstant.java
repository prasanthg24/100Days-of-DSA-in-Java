package com.Prasanth.Assignment2;

import java.util.Scanner;

public class VowelRConstant {
    public static void main(String[] args) {
        Scanner input   = new Scanner(System.in);
        System.out.print("Enter the value = ");
       char n = input.next().charAt(0);
        if (n =='a'||n =='e'||n =='i'||n =='o'||n =='u'||n =='A'||n =='E'||n =='I'||n =='O'||n =='U')
        {
            System.out.println( "Vowel");
        }
        else
        {
            System.out.println( "Constant");
        }


    }
}

