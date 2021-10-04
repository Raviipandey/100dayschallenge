/* Java Program to create a 2D array and printing a matrix*/
import java.util.*;
public class Day21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int cols = sc.nextInt();
        int[][] num = new int[rows][cols];
        for(int i=0; i<rows; i++)
        {
            System.out.println("Enter the elements for row " +(i+1));
            for(int j=0; j<cols; j++)
            {
                num[i][j] = sc.nextInt();
            }
        }
        System.out.println("The entered elements are ");
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                System.out.print(num[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
