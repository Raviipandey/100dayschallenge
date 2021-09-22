import java.util.*;
public class Day6 {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is even odd ");
        int n = sc.nextInt();
        if(n%2==0)
        {
            System.out.println("Number is EVEN");
        }
        else
            System.out.println("Number is ODD");
    }
}
