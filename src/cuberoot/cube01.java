package src.cuberoot;

import java.util.Scanner;

    public class cube01 {
        public static void main(String[] args) {
            //Take the inputs from the user to calculate

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the inputs x,y,z to calculate");
            double x = sc.nextDouble();
            double y= sc.nextDouble();
            double z = sc.nextDouble();

            double a = x*x;
            double b = y*y;
            double c = Math.abs(z);
            double d = Math.cbrt(a+b-c);

            //printing the final result

            System.out.println("The cube root of the given inputs is = "+ d );

        }
    }
