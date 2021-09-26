import java.util.*;
public class Day12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number here");
        int n = sc.nextInt();
        int r, temp = n, sum=0;
        while(temp>0)
        {
            r= temp%10;
            sum = sum + (r*r*r);
            temp/=10;
        }
        if(sum==n)
            System.out.println("Number is Amrstrong");
        else
            System.out.println("Number is Not Armstrong");
    }
}
