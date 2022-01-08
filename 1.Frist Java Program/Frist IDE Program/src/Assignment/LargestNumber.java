package Assignment;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        int  a ,b ;
        System.out.println("Enter the a value = ");
        a = input.nextInt();
        System.out.println("Enter the b value = ");
        b = input.nextInt();
        if(a>b)
        {
            System.out.println("a is greater than b");
        }
        else
        {
            System.out.println("b is greater than a");
        }
    }
}
