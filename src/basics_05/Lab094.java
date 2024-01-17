package src.basics_05;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab094 {
    public static void main(String[] args) {

        // Problem
        // Factorial Program
//        1! -> 1
//        2! -> 2*1
//        3! -> 3*2*1
//        5! -> 5*4*3*2*1 = 120
        //user_input = 5
        //print -> 120


        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = sc.nextInt();
        long fact = 1;

        // 5  -> i = 1 to 5 ->  fact = fact * i , i++
        // A -> int i = 1;
        // B -> i <=number or i < =5
        // C -> i++
        // D -> fact = fact*i

        //using while loop

//        int i=1;
//        while(i<=number){
//            fact = fact*i;
//            i++;
//        }
//        System.out.println("Fact -> "+ fact);

        //using for loop

        for(int i=1; i<=number; i++){
            fact= fact*i;
        }
        System.out.println("Factorial of the number is --> "+fact);
        sc.close();
    }
}
