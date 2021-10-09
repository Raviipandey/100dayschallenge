/* Chef has an exam which will start exactly M minutes from now. However, instead of preparing for his exam,
Chef started watching Season-1 of Superchef. Season-1 has N episodes, and the duration of each episode is K minutes.
Will Chef be able to finish watching Season-1 strictly before the exam starts?
 T = No. of test cases */

import java.util.*;
public class Day23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int K = sc.nextInt();
            if ((N * K) < M) {
                System.out.println("YES\n");
            } else
                System.out.println("NO\n");
        }

    }
}