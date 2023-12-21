package src.basics_03;
import java.util.Scanner;

public class Lab046 {


    public static void main(String[] args) {

        // Take an input from user in Java
        Scanner sc = new Scanner(System.in); // input stmt to take input values from the user
        System.out.println("Enter the number, I will tell if it is even/odd");
        int a  = sc.nextInt();

// Odd or even program

        if(a%2 == 1){
            System.out.println("ODD Number");
        }else{
            System.out.println("Even Number");
        }

    }
}
