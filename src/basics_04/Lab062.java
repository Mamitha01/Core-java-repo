package src.basics_04;

import java.util.Scanner;

public class Lab062 {
    public static void main(String[] args) {


        //  A = x^2
        // B - y^2
        // c = |z|

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the inputs x,y,z to calculate");
        double x = sc.nextDouble();
        double y= sc.nextDouble();
        double z = sc.nextDouble();

        System.out.println("The output for the given inputs is ="+ (Math.cbrt(x * x+ y * y-Math.abs(z))));
    }
}
