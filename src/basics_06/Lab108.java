package src.basics_06;

public class Lab108 {
    public static void main(String[] args) {

        // Create a program that determines whether a given year is a leap year.

        int year = 2000;
        // (year%4 ==0)
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Year");
        }
    }
}
