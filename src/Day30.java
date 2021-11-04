/* Case Sensitivity in string methods
 1) 'toUpperCase' function - Prints the given string in caps
 2) 'toLowerCase' function - Prints the given string in small
 */
import java.util.*;
public class Day30 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String text1 = "hello this is the sample for upper case";
      String text2 = "HELLO THIS IS THE SAMPLE FOR LOWER CASE";
        System.out.println(text1.toUpperCase());
        System.out.println(text2.toLowerCase());
    }
}