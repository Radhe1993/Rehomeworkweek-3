package rehomework;

import java.util.Scanner;

/**
 * Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
public class Programme_13
{
    public static void day()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the day");
        int day = ob.nextInt();
         switch (day)
         {
             case 1:
                 System.out.println("Monday");
                 break;
             case 2:
                 System.out.println("tuesday");
                 break;
             case 3:
                 System.out.println("wednesday");
                 break;
             case 4:
                 System.out.println("Thursday");
                 break;
             case 5:
                 System.out.println("Friday");
                 break;
             case 6:
                 System.out.println("Saturday");
                 break;
             case 7:
                 System.out.println("Sunday");
                 break;
             default:
                 System.out.println("Week contains only 1 to 7 day");
         }


    }
    public static void main(String[] args)
    {
        day();
    }
}