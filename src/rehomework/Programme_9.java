package rehomework;

import java.util.Scanner;

/**
 * Input any alphabet from “A to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry USING SWITCH STATEMENT
 */

public class Programme_9
{
      public void city (String city)
      {
          switch (city)
          {
              case "A":
                  System.out.println("Aberdeen");
                  break;
              case"B":
                      System.out.println("Belfast");
                  break;
              case"C":
                  System.out.println("Cambridge");
                  break;
              case "D":
                  System.out.println("Derby");
                  break;
              case "E":
                  System.out.println("Edinburgh");
                  break;
              case "F":
                  System.out.println("Feltham");
                  break;
              default:
                  System.out.println("Not found");
          }
      }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter alphabet : ");
       String alphabet=  ob.nextLine();
        Programme_9 obj = new Programme_9();
        obj.city("city");
    }
}
