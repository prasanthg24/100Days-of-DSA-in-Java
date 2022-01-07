package com.company;

import java.util.Scanner;

public class Typecasting
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        System.out.println(num);
        //Typecasting
          int num = (int)(99.9f);
          System.out.println(num);
        //automatic type promotion in expressions
        int a = 257;
        byte b= (byte)(a);
        System.out.println(b);





    }

}

