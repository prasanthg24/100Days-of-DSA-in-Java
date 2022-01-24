package Assignment;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);

        System.out.print( "Enter the value = ");
        int n = input.nextInt();

        System.out.println(Palind(n));



    }

     static boolean Palind(int n) {
        int rem =0, temp = n,sum = 0;
        while ( n > 0)
        {
            rem = n % 10;
             sum = (sum *10 ) + rem;
            n = n /10;
        }
        if(temp == sum)
            return  true;
        else
            return  false;
    }
}
