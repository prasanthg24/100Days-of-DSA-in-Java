package Assignment;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args)
    {

        Scanner input = new Scanner( System.in);
        int num1,num2,num3 ;

        System.out.print(" Enter num1 ,num2 ,num3 = ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        //Min( num1,num2,num3);
        System.out.println("Max = " +  Max(num1,num2,num3)) ;
        System.out.println("Min = "+  Min(num1,num2,num3)) ;
    }

    static int Max(int num1, int num2, int num3)
    {
        int max = num1;

      if (num2 > max )
            max = num2;
      if ( num3 > max)
            max = num3;

      return  max;
    }

    static int Min(int num1, int num2, int num3)
    {
        int min = num1;

        if (num2 < min )
            min = num2;
        if ( num3 <  min)
            min = num3;

        return  min;
    }
}

