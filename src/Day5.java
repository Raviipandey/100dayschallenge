/* WAP to check for prime number */
import java.util.*;
public class Day5 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number here to check whether it is prime or not ");
          int a = sc.nextInt();
          int b = 0;
          for (int i = 1; i <= a; i++)
          {
               if (a % i == 0)
               {
                    b = b+1;
               }
          }
          if(b<3)
          {
               System.out.println("Given number is prime. ");
          }
          else
               System.out.println("Given number is not prime. ");
     }
}