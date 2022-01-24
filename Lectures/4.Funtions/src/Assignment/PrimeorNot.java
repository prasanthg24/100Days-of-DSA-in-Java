package Assignment;

import java.util.Scanner;

public class PrimeorNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        System.out.println( "Prime or Not = " + Prime( n));

    }
    static boolean Prime(int a)
    {
     if(a <=1 )
     {
         return  false;
     }
        for (int i = 2; i <= a/2 ; i++) {
            if ( a % i ==0 )
            {
                return  false;
            }

        }
        return  true;
    }
}
