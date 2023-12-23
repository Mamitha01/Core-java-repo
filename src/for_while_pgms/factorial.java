package src.for_while_pgms;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        // factorial using while loop
        int fact = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial of: ");
        int n = sc.nextInt();

        int i = 1;
        while( i <= n ){
            fact = fact * i;
            i++;
        }


        System.out.println("Factorial of " + n + " is: " + fact);
    }
}



