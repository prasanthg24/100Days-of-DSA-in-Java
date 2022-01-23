package Assignment;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print( "Enter the age = ");
        int n = input.nextInt();
        System.out.println( " Eligible to Vote or Not = "+ Vote(n));
    }
    static boolean Vote(int age)
    {
        if(age >= 18 )
        {
            return true;
        }
        else
        {
            return  false;
        }
    }
}
