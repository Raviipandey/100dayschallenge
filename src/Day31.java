/* Finding the location of character in the string
   -> indexof() function helps to find location of character
   -> while counting characters it also counts blankspaces
   -> This function start counting from 0 */
import java.util.*;
public class Day31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = "Hello this is windows 11";
        System.out.println(text.indexOf("win"));
    }
}
