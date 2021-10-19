/* 'CompareTo' function - It compares two strings */
import java.util.*;
public class Day29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        /* Comparison
        1) s1>s2 ---> +ve value
        2) s1=s2 ---> 0
        3) s1<s2 ---> -ve value
         */

        if(a.compareTo(b)==0)  //compareTo function
        {
            System.out.println("Strings are Equal");
        }
        else{
            System.out.println("Strings are not Equal");
        }
    }
}
