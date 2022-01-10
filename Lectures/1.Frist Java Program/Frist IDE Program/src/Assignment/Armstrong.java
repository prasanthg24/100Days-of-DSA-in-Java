package Assignment;

import java.util.Scanner;

public class Armstrong
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
       int  rem, temp ,sum = 0;
        temp = n ;
        while (n>0)
        {
            rem = n%10;
            sum = (int) (sum + Math.pow(rem,3));
            n = n/10;

        }
        if ( temp == sum )
            System.out.println( temp + " Armstrong Number");
        else
            System.out.println( temp + " Not an Armstrong Number ");
    }
    }


