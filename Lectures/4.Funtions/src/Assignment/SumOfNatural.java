package Assignment;

import java.util.Scanner;

public class SumOfNatural {
    public static void main(String[] args) {

        Scanner input = new Scanner( System .in );
        System.out.print( "Enter the value = ");
        int n = input.nextInt();
        sum(n);
    }

   static void sum(int n) {
        int sum = 0;
       for (int i = 1; i <=n ; i++) {

           sum = sum + i;
       }
       System.out.println( "Sum of Natural Number = " + sum);
    }
}
