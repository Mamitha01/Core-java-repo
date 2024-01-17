package src.basics_05;
import java.util.Scanner;

public class Lab095 {
    public static void main(String[] args) {

        // Sum of Digit = 5+4+3+2+1

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = sc.nextInt();

        long Sum = 0;
        // 5  -> i = 1 to 5 ->  fact = fact * i , i++
        // A -> int i = 1;
        // B -> i <=number or i < =5
        // C -> i++
        // D -> fact = fact+i


        // using while loop
//        int i=1;
//        while(i<=number){
//            fact = fact*i;
//            i++;
//        }
//        System.out.println("Fact -> "+ fact);

        // using For loop
        for (int i = 0; i <=number ; i++) {
            Sum= Sum +i;

        }
        System.out.println(Sum);
        sc.close();
    }
}
