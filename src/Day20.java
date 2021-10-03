import java.util.Scanner;
/* Java Program to create Array, take input and print given numbers */
public class Day20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declaring Array Of name Marks
        System.out.println("Enter the size of Array :");
        int N = sc.nextInt();
        int[] marks = new int[N];
        System.out.println("Enter the elements: ");
        for(int i=0; i<N; i++)
        {
            marks[i] = sc.nextInt();
        }
        System.out.println("The entered elements are:");
        for(int i=0; i<N; i++)
        {
                System.out.println(marks[i]);
        }
    }
}