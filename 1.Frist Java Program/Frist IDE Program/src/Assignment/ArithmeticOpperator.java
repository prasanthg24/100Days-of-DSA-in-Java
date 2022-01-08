package Assignment;

import java.util.Scanner;

public class ArithmeticOpperator
{
    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value = ");
        a = input.nextInt();
        System.out.println("Enter b value = ");
        b = input.nextInt();
        float add , sub , mul , div , mod ;
        add = a+b;
        sub = a-b;
        mul = a*b;
        div = a/b;
        mod = a%b;
        System.out.println( " Addition = " +add );
        System.out.println( " Subtraction = " +sub);
        System.out.println( " Divide = " +div);
        System.out.println(" Multipilcation" +mul) ;
        System.out.println( " Modules = "+mod);
    }
}
