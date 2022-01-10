package Assignment;

import java.util.Scanner;

public class ISTtoUSD {
    public static void main(String[] args) {
        System.out.println("Enter the value in Rupees = ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        float usd  = n / 72;
        System.out.println( "Dollar = "+ usd);
    }
}
