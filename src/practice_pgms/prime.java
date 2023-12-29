package src.practice_pgms;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {

        //creating a program to check if the given number is prime or not using for loop
        // should print that 45 is not a prime number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = sc.nextInt();
        boolean f = false;
        for (int i = 2; i < number/2; i++) {

            if (number % i == 0) {
                f = true;
                break;
            }
        }

        if (f==false)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");

    }
}
