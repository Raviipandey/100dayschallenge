import java.util.*;
public class Day7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*****Welcome to the calculator program***** \nWith how many numbers you want to perform operations ?");
        int n = sc.nextInt();
        System.out.println("Enter your "+n+" numbers here ");
        float sum = 0;
        float prod = 1;
        float avg = 0;
        for(int i = 1; i<=n ; i++)
        {
           int a = sc.nextInt();
           sum = sum +a;
           prod = prod*a;
           avg = avg+a;
        }
        System.out.println("Select the operation: \n--> Enter 1 to add the numbers \n--> Enter 2 to multiply the numbers \n--> Enter 3 to find avg of the numbers ");
        int b = sc.nextInt();
        switch(b)
        {
            case 1:
                System.out.println("The sum of given numbers is "+sum);
                break;
            case 2:
                System.out.println("The product of given numbers is "+prod);
                break;
            case 3:
                System.out.println("The average of given numbers is "+avg/n);
                break;


        }
    }
}
