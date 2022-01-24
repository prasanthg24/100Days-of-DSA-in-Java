package Assignment;

import java.util.Scanner;

public class Factorial {
    public static void main(String [] args)
    {
       Scanner input = new Scanner( System.in);
        System.out.print( " Enter the value = ");
        int n = input.nextInt();
        System.out.println( Fact(n));

    }
    static int Fact(int n )
    {
        int fact =1 ;
        for (int  i = 1;  i <= n ;  i++) {
             fact = fact*i;

        }
        return fact;
    }
}
