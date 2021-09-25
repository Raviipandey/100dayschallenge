import java.util.Scanner;

public class Day11 {
    public static int factorial (int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++)
        {
                fact = fact * i;
        }
            return fact;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number to calculate factorial");
            int a = sc.nextInt();
            System.out.println(factorial(a));
        }

    }

