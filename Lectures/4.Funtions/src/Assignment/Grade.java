package Assignment;

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        System.out.print( "Enter the Percentage = ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println(Grade(n));
    }

    static String  Grade( int n)
    {
        if( n >= 91 && n <=100)
        {
            return  "AA";
        }
        else if( n >= 81 && n <= 90)
        {
            return  "AB";
        }
        else if( n >= 71 && n <= 80)
        {
            return  "BB";
        }
        else if( n >= 61 && n <= 70)
        {
            return  "BC";
        }
        else if( n >= 51 && n <= 60)
        {
            return  "CD";
        }
        else if( n >= 41 && n <= 50)
        {
            return  "DD";
        }
        else
        {
            return "Fail";
        }
    }
}
