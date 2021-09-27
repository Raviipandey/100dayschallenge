/* Create a function to print sum of odd numbers upto n */

import java.util.Scanner;
public class Day13
{
    public static void printSum(int n){
            int sum = 0;
            for(int i = 1; i<=n ;i++)
            {
                if(i%2!=0)
                {
                    sum = sum+i;
                }
            }
            System.out.println(sum);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your number here : ");
            int n = sc.nextInt();
            printSum(n);
    }
}