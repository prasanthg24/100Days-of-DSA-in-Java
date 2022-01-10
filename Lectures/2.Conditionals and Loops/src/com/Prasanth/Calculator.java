package com.Prasanth;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input  = new Scanner( System.in);
        //Take input from user till user does not press X or x
        int ans = 0;
        while ( true )
        {
            System.out.print( "Enter the opeator to perform = ");
            char op = input.next().charAt(0);
            if (op == '+' || op == '-' || op=='*'||op =='/' || op=='%')
            {
                // input 2 numbers
                System.out.print( "Enter the value 1 = ");
                int num1 = input.nextInt();
                System.out.print( "Enter the value  2 = ");
                int num2 = input.nextInt();

                if( op == '+')
                {
                    ans = num1+num2;
                }
                if( op == '-')
                {
                    ans = num1-num2;
                }
                if( op == '*')
                {
                    ans = num1*num2;
                }
                if( op == '/')
                {   if(num2!=0)
                     {
                        ans = num1 / num2;
                     }
                }
                if( op == '%')
                {
                    ans = num1%num2;
                }
                System.out.println(ans);
            }
            else if (op == 'x'|| op == 'X')
            {
                break;
            }
            else
            {
                System.out.println("Invalid input");
            }

        }

    }
}
