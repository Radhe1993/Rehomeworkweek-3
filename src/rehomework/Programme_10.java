package rehomework;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class Programme_10
{
    public static void maths()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter a =");
        int a = ob.nextInt();
        System.out.println("b= ");
        int b =  ob.nextInt();
        System.out.println("enter symbol = ");
        char symbol = ob.next().charAt(0);

        if(symbol=='+')
        {
            System.out.println(a+b);
        }
        else if(symbol=='-')
        {
            System.out.println(a-b);
        }
        else if(symbol=='*')
        {
            System.out.println(a*b);
        }
        else if (symbol=='/')
        {
            System.out.println(a/b);
        }
        else
        {
            System.out.println("Please enter correct symbol ");
        }
    }

    public static void main(String[] args) {
        maths();
    }

}
