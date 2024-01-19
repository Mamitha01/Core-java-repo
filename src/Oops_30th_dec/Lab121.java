package src.Oops_30th_dec;

import java.util.Scanner;

public class Lab121 {
    public static void main(String[] args) {

        //        int a = 10;
//        int b= 23;
        // b = 10, a = 23

        //swapping 2 numbers using a third variable

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a ");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();


        int temp =a;
        a=b;
        b= temp;

        System.out.printf("After swapping value of a is --> %d \n",a);
        System.out.printf("After swapping value of b is --> %d",b);

        sc.close();


    }
}
