/* CharAt function - Prints particular character from given string */
import java.util.*;
public class Day28 {
    public static void main(String[] args) {
        String Firstname = "Ravi";
        String Middlename = "Shankar";
        String Lastname = "Pandey";
        String Fullname = Firstname  + " " + Middlename + " " + Lastname ;
        for(int i=0; i<Fullname.length(); i++)  // Fullname.length() gives number of characters in the string.
        {
            System.out.println(Fullname.charAt(i)); // CharAt(i) prints the character present at position i
        }
    }
}
