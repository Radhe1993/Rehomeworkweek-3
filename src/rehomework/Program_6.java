package rehomework;

import java.util.Scanner;

/**
 * Write a java program to input any number  and find out if it is odd or even
 *
 */

public class Program_6
{
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to check  :");
        int number = scanner.nextInt();
        Program_6  oddEven = new Program_6();
        System.out.println(number + "is"+oddEven.isItEvenorOdd(number)+"number");
        // Closing the scanner object
        scanner.close();

    }//Checking the odd or even
    public String isItEvenorOdd(int number)
    {
        if(number%2==0)
        {
            return "Even";
        }
        else
        {
            return "odd";
        }
    }


}
