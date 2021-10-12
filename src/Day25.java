/* Team RCB has earned X points in the games it has played so far in this year's IPL.
To qualify for the playoffs they must earn at least a total of Y points.
They currently have Z games left, in each game they earn 2 points for a win, 1 point for a draw, and no points for a loss.
 Is it possible for RCB to qualify for the playoffs this year?
 T is number of test cases */
import java.util.*;
public class Day25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=1 ; i<=T ; i++)
        {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            if(X+Z*2>=Y)
            {
                System.out.println("YES\n");
            }
            else
                System.out.println("NO\n");
        }
    }
}
