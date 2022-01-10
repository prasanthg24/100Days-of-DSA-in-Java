package Assignment;

import java.util.Scanner;

public class Palindrome {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to palindrome  = ");
        int n = input.nextInt();
        int temp = n ,sum = 0 ,rem;

        while ( n > 0)
        {
            rem = n%10;
            sum = sum*10 +rem;
            n= n /10;

        }

        if (temp == sum)

        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }

    }}
