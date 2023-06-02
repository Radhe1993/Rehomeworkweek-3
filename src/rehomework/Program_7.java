package rehomework;

import java.util.Scanner;

/**
 * write a java input seller id,seller name,sales amount , and basic salary
 * then find this sales
 * Commission
 * Sales amount & gt; = 50000 35%
 * Sales amount &gt; = 30000 20%
 * &gt; = 20000 10%
 * %gt; = 10000 5%
 * &lt; 10000 2%
 *
 */

public class Program_7
{
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Seller name : ");
        String name = scanner.nextLine();
        System.out.println("Enter Seller ID : ");
        int sellerId = scanner.nextInt();
        System.out.println("Enter sales Amount : ");
        int salesAmount = scanner.nextInt();
        System.out.println("Enter basic salary :");
        int basicSalary = scanner.nextInt();
        //creating the object to call instance method
        Program_7 ob= new Program_7();
        int grossSalary = basicSalary+ob.calculateCommission(salesAmount);
        System.out.println("Seller name is            : " + name);
        System.out.println("Seller id is              : " + sellerId);
        System.out.println("Seller's sales amount is  : " + salesAmount);
        System.out.println("Seller's basic salary is  : " + basicSalary);
        System.out.println("Seller's gross salary is  : " + grossSalary);
        // closing the scanner object
        scanner.close();
    }
        // calculating the sales commission
    public int calculateCommission(int salesAmount) {
        int commission;
        if (salesAmount >= 50000) {
            commission = (salesAmount * 35) / 100;
            System.out.println("Sales Commission is " + commission);
        } else if (salesAmount >= 30000) {
            commission = (salesAmount * 20) / 100;
            System.out.println("sales Commissiopn is " + commission);
        } else if (salesAmount >= 20000) {
            commission = (salesAmount * 10) / 100;
            System.out.println("Sales Commision is " + commission);
        } else if (salesAmount >= 10000) {
            commission = (salesAmount * 5) / 100;
            System.out.println("Sales commission is " + commission);
        } else {
            commission = (salesAmount * 2) / 100;
            System.out.println("sales commission is " + commission);
        }

        return commission;
    }

    }


