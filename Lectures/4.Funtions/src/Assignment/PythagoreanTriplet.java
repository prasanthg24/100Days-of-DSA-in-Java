package Assignment;

import java .util.*;
public class PythagoreanTriplet {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.print("Enter the values a ,b ,c = ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        System.out.print("Pythagorean Triplet = " + PythagoreanTriplet(a,b,c));
    }

  static boolean  PythagoreanTriplet(int a ,int b ,int c)
    {
        int max = a;
        if(b > max)
            max = b;
        if( c > max)
            max = c;

        if(max == a )
        {
         return b*b +c*c == a*a;
        }
        else if(max == b)
        {
            return  a*a + c*c == b*b;
        }
        else
        {
            return  a*a + b*b == c*c;
        }
    }
}
