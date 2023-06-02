package rehomework;

import java.util.Arrays;

/**
 * Write a Java program to sum values of an array.
 */

public class Program_18
{
    public static void main(String[] args) {
        int num[] = {1999, 2000, 2001, 2002, 2003, 2004, 2005};
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println(Arrays.toString(num));
        System.out.println(sum);
    }
}
