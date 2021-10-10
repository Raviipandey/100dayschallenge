import java.util.*;
public class Day24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int temp;
        for(int i=1; i<=N; i++)
        {
            if(N%i==0)
            {
                count = count +1;
            }
        }
        System.out.println("No of factors = "+count);
        System.out.print("The factors are = ");
        for(int j=1; j<=N; j++)
        {
            if(N%j==0){
                System.out.print(j+" ");
            }

        }

    }









}
