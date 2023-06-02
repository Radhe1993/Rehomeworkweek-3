package rehomework;
/**
 * number of day in month
 * Write a method isLeapYear with a parameter of type int named year
 * The parameter needs to be grater then or equal to 1 and less then or equal to
 * 9999.If the parameter is not in that range ,calculator if the year is leap year and return true if it
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and retur
 * n true if it is,
 * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400
 * Example of input/output
 * isLeapYear(-1600); should return false since the parameter is not in the range(1-9999)
 * isLeapYear(2000); should return true because 2000 is not a leap year
 * Write another method getDayInMonth with two parameter month and year .Both of type int
 * If parameter month is &It; 1 or & gt; 12 return -1
 * If parameter year is &it;1 or & gt;9999 than return -1.
 * This method needs to return the numbefr of days in the month.be careful about leap yea
 * they have 29 days in month 2(Ferbruary)
 * You should check if the year is a leap year using the method is LeapYear describe above
 * Example of input/Output;
 * getDaysInMonth(1,2020); should 31 since january has 31 days
 * getDaysInMonth(2,2020); should return29 since february has 29 days in year and 2020 is a leap year
 * getDayInMonth(2,2018); should return 28 since february has 28 days if it's not a leap year and
 * getDayInMonth(-1,2020); should return -1 since the parameter month is invalid.
 * getDaysMonth(1,-2020); should return -1 since the parameter
 * NOTE : Method isLeapYear and getDaysMonth need to be public static
 */

public class Program_4
{
    public static void main(String[] args) {

        //Leap year 4 outputs
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        System.out.println("--------------------------------------------------");

        //5 outputs to get days in a month
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));

    }

    // Checking is it leap year
    public static boolean isLeapYear(int years) {
        boolean b;
        if (years <= 1 || years >= 9999) {
            b = false;
        } else {
            b = years % 4 == 0 && years % 100 != 0 || years % 400 == 0;
        }
        return b;
    }

    // Calculating the days of the month depends on year
    public static int getDaysInMonth(int month, int year) {
        int days = 0;
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                if (isLeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
        }
        return days;
    }
}



