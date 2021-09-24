import java.util.*;
public class Day9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
        System.out.println("Enter the value of b :");
        int b = sc.nextInt();
        System.out.println("-----Before swapping the numbers-----");
        System.out.println("a="+a+"\nb="+b);
        int temp = a;
            a = b;
            b = temp;
        System.out.println("-----After swapping the numbers-----");
        System.out.println("a="+a+"\nb="+b);
    }
}
