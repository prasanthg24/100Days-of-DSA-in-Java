package Assignment;

import java.util.Scanner;

public class OddEven
{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print(" Enter the Input value = ");
        int n = input.nextInt();
        //logic to find Odd or Even

        if (n%2 == 0 )
        {
            System.out.println( n + " 2is Even number ");
        }
        else
        {
            System.out.println(n + " is Odd number");
        }

    }
}
