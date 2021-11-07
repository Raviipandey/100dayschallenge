/* Printing random number using Math.random() function
 -> This function give output as double, to get output as int we can use typecasting
 -> Multiplying the function with a number defines it's range
 */
import java.util.Scanner;
public class Day34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = (int)(Math.random() * 10);
        System.out.println(a);
    }
}
