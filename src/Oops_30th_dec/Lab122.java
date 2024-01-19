package src.Oops_30th_dec;
import java.util.Scanner;

public class Lab122 {
    public static void main(String[] args) {

        //Swapping two variables without a third variable

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a ");
        int a = sc.nextInt();
        System.out.println("Enter b ");
        int b = sc.nextInt();

        a= a+b; //10+20 -> 30
        b= a-b;// 30-20 -> 10
        a= a-b; //  30-10 -> 20

        System.out.printf("Value of a is --> %d \n", a);
        System.out.printf("Value of b is --> %d \n", b);






    }
}
