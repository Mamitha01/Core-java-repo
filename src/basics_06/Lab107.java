package src.basics_06;

public class Lab107 {
    public static void main(String[] args) {

        // FizzBuzz Problem:


        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }

        System.out.println(" -- End Of the Program --");

    }
}
