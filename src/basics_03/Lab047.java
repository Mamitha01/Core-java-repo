package src.basics_03;
import java.util.Scanner;

public class Lab047 {
    public static void main(String[] args) {

        // Take three input from user and give max out of two number
        // a,b  a>b -> a, else b

        Scanner sc = new Scanner(System.in); // OOPs concept
        System.out.println("Enter the a,b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Max is " + a);
        } else {
            System.out.println("Max is " + b);
        }
        // concatenation - combine two or more things

    }
}
