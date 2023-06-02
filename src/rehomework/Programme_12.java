package rehomework;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */

public class Programme_12
{
    public static void number()
    {

        Scanner ob= new Scanner(System.in);
        System.out.print("enter any character = ");
     char   ch = ob.next().charAt(0);
     if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')
     {
         System.out.println(ch+" is alphabet");
     }
     else if(ch>=1&&ch<=9)
     {
         System.out.println(ch+" is number");
     }
     else
     {
         System.out.println(ch+" is symbol");
     }

    }

    public static void main(String[] args) {
        number();
    }

}
