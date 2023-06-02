package rehomework;
/**
 * Write a Java program to test if an array contains a specific
 * value.
 */
public class Programme_20
{
    public static boolean isArray(int arr[],int item) {
        boolean b = false;
        for (int i = 0; i < arr.length; i++) {
            b = true;
            break;
        }
        return b;
    }

    public static void main(String[] args) {
        int arr[] = {1789,20352040,1950,2255,7497};
        System.out.println(isArray(arr,2035));
        System.out.println(isArray(arr,2001));
    }

}
