package rehomework;

import java.util.Scanner;

/**
 * Input any alphabet from “A to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Program_8
{
    public static void main(String [] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter alphabet between A to F : ");
        char city = scanner.next().charAt(0);
        // Object creation
        scanner.close();
        Program_8 cityName = new Program_8();
        cityName.printCityName(city);
        //Closing the scanner object


    }
    //Printing city name
    public  void printCityName(char city)
    {
        if(city =='A'|| city == 'a')
        {
            System.out.println("Aberdeen");
        }
        else if(city == 'B'||city=='b')
        {
            System.out.println("Belfast");
        }
        else if(city=='C'||city=='c')
        {
            System.out.println("Cambridge");
        }
        else if(city=='D'||city=='d')
        {
            System.out.println("Derby");
        }
        else if(city=='E'||city=='e')
        {
            System.out.println("Edinburgh");
        }
        else if (city=='F'||city=='f')
        {
            System.out.println("not found");
        }
    }
}
