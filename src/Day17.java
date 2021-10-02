/* Java Program to calculate Square of Given number */
import java.util.Scanner;
public class Day17 {
    private static Scanner sc;
    public static void main(String[] args)
    {
        int num, sq;
        sc = new Scanner(System.in);

        System.out.print(" Please Enter your number here to calculate square : ");
        num = sc.nextInt();

        sq = num * num;

        System.out.println("\n The Square of a Given Number is"+ "  =  " + sq);
    }
}
