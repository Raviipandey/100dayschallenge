/* Printing square root of a number using function Math.sqrt(x)
   This function prints square root of x  */
import java.util.*;
public class Day33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to calculate the square root : ");
        int a = sc.nextInt();
        System.out.println("The square root of " + a + " is " + Math.sqrt(a));
    }
}
