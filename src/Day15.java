import java.util.*;

public class Day15 {
    public static boolean isElligible(int age) {
        if(age > 18) {
            return true;
        }
        return false;
    }
    public static void main(String args[]) {
        System.out.println("Enter your age here : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(isElligible(age));
    }
}