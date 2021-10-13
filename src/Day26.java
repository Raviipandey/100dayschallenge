/* Chef is always trying to find patterns within integers.
 Today Chef has 3 positive integers and he wonders if any one of them can be written as the sum of the other two integers. */
import java.util.*;
public class Day26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int c = sc.nextInt();
        int b = sc.nextInt();
        if(c==a+b || a==b+c || b==a+c)
        {
            System.out.println("YES\n");
        }
        else
            System.out.println("NO\n");

    }
}
