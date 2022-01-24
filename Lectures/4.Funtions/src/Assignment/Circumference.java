package Assignment;

import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner input = new Scanner( System .in);
        System.out.print( "Enter the radius = ");
        int n = input.nextInt();

        System.out.println( " Area = " + Area(n));
        System.out.println( " Circumference = " + Circumference(n));
    }
    static double Area(int r)
    {
        double Area =   Math.PI* r*r;
        return  Area;
    }
    static  double Circumference( int r)
    {
        double Circumference = Math.PI * 2 * r;
        return  Circumference;
    }
}
