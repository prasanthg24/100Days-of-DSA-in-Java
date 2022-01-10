package Assignment;

import java.util.Scanner;

public class SimpleInterest
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int P,N,R;
        System.out.print("Enter the Principle = ");
        P = input.nextInt();
        System.out.print("Enter the No of Years = ");
        N = input.nextInt();
        System.out.print("Enter the Rate = ");
        R = input.nextInt();

        //Simple Interest
        float SI;
        SI = (P*N*R)/100;
        System.out.println("Simple Interest = " + SI);
    }
}
