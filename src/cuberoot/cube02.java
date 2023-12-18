package src.cuberoot;

import java.util.Scanner;

public class cube02 {
    public static void main(String[] args) {
        //Take the inputs from the user to calculate

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the inputs x,y,z to calculate");
        double x = sc.nextDouble();
        double y= sc.nextDouble();
        double z = sc.nextDouble();

        System.out.println("The output for the given inputs is ="+ (Math.cbrt(x * x+ y * y-Math.abs(z))));
    }
}
