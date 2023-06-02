package rehomework;

import java.util.Arrays;

/**
 * Write a Java program to calculate the average value of array
 */
public class Program_19 {
    public static void main(String[] args) {
        int a[]= {1999,2000,2001,2002,2003,2004,2005};
        int sum = 0;
        for(int i=0;i<a.length;i++)
        {
            sum = sum+a[i];
        }
        int avg = sum/a.length;
        System.out.println(Arrays.toString(a));
        System.out.println(avg);
    }
}
