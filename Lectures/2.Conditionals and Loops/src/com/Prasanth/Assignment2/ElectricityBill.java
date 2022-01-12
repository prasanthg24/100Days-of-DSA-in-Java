package com.Prasanth.Assignment2;
import java.util.*;
public class ElectricityBill {
    public static void main(String []args )
    {
        Scanner input   = new Scanner( System.in);
        System .out.print("Enter the unit - ");
        float unit = input.nextFloat();
        double sum  = 0;

        if(unit <= 100)
        {
            sum = unit*1.20;
        }
        else if(unit <= 200)
        {
            sum = (unit - 100)*2 + (100*1.20);
        }
        else if( unit  > 200 )
        {
            sum = (300 - unit  )*3 + (100 *1.20 )+(200*2);
        }

        System.out.println( "Electricity bill for "+unit +"Units = "+sum);
    }
}
