package rehomework;

import java.util.Scanner;

/**
 * 1.Write a java program that tells us that Input number is odd
 * HINT: use ternary operator(? :)
 */

public class Program_1
{
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number :");
        int number = scanner.nextInt();
        isItOddOrEvenNumber(number);
        // closing the scanner object
        scanner.close();
    }
        // checking the number is even or odd
    public static void isItOddOrEvenNumber(int number)
    {
        String evenOrOdd = (number%2 ==0)?"Even" : "odd";
        System.out.println("The "+number+" is "+evenOrOdd+" number");
    }
}
