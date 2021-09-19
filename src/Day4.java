import java.util.*;
public class Day4 {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            System.out.println(+a +" is greater than "+b);
        }
        else
            System.out.println(+b+ " is greater than "+a);

    }

}
