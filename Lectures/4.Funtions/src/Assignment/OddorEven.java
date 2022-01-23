package Assignment;

import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {

        Scanner input = new Scanner( System.in);
        System.out.print( "Enter the value = ");
        int n = input.nextInt();
        System.out.println(OddEven(n) );
    }

   static boolean OddEven(int n) {
        if (n % 2 == 0)
        {
            return  true;
        }
        else
        {
            return  false;
        }
    }
}
