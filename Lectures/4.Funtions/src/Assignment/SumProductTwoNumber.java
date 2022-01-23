package Assignment;

import java.util.Scanner;

public class SumProductTwoNumber {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print( "Enter num1 and num2 value = ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        System.out.println("Sum of num1 and num2 =  "+sum(n1,n2) );
        System.out.println( "Product of num1 and num2 = "+ product(n1,n2));

    }
    static int sum(int a , int b)
    {
        return  a+b;
    }
    static  int product(int a,int b)
    {
        return  a*b;
    }
}
