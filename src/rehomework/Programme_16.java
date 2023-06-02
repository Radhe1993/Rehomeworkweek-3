package rehomework;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class Programme_16
{
    public static void number()
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("number = ");
        int number = ob.nextInt();
        if(number>0)
        {
            System.out.println(number+" is Positive");
        }
        else if(number<0)
        {
            System.out.println(number+" is Nagative");
        }
        else
        {
            System.out.println(number+" is Zero");
        }
    }

    public static void main(String[] args) {
        number();
    }
}
