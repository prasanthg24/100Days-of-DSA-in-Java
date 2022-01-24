package Assignment;

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {


        Scanner input = new Scanner(System .in);
        System.out.print("Enter the range start to end = ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();


        Prime(n1,n2);
    }

   static void Prime(int n1, int n2)
   {
            int a;

           for( int  i = n1 ; i <= n2 ;i++)
           {
               a = 0 ;
               for (int j = 2; j <= i; j++)
               {
                    if(i % j  ==  0)
                    {
                        a ++;
                    }


               }
               if(a == 1 )
                   System.out.print(i + " , ");


           }


   }
}
