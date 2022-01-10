package Assignment;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Name = " );
        String s = input.nextLine();

        //Greetings
        System.out.println("Hi "+s + " Welcome to DSA with Kunal ");
    }
}
