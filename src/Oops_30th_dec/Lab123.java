package src.Oops_30th_dec;
import java.util.Scanner;

public class Lab123 {
    public static void main(String[] args) {

        //try and catch

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a");
            int a = sc.nextInt();
            System.out.println("Enter b");
            int b = sc.nextInt();


            a = a * b;
            a = a / b;
            b = a / b;

            System.out.printf("Value of a is %d \n", a);
            System.out.printf("Value of b is %d \n", b);
        }catch(Exception c ){
            System.out.println("Zero not possible");
        }


        // bitwise xor
//        a = a ^ b; // BINARY AND XOR GATE
//        b = a ^ b;
//        a = a ^ b;


    }
}
