package src.basics_04;
import java.util.Scanner;
public class Lab048 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        // else if condition
        if( number > 20){
            System.out.println("Number is > 20");
        }else if ( number > 10){
            System.out.println("Number is > 10");
        }else {
            System.out.println("Number is < 20");
        }



    }
}
