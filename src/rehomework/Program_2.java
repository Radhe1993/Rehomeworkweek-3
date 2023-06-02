package rehomework;
/*
Write a java program to input any year like(ex.2007)and find out if it is leap year or not?
*/

import java.util.Scanner;

public class Program_2
{
    public static void main(String[] args) {
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the year");
        int year = scanner.nextInt();
        Program_2 ob = new Program_2();
        ob.isItLeapYear(year);
        // closing the scanner object
        scanner.close();
    }
    // checking is it leap year or not
    public void isItLeapYear(int year)
    {
        if(year%4==0 && year%100!=0||year%400==0)
        {
            System.out.println("The year "+year+ " is leap year");

        }
        System.out.println("The year "+year+ "is not a leap year ");

    }
}
