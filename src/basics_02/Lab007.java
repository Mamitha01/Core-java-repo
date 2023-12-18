package src.basics_02;

public class Lab007 {
    public static void main(String[] args) {
        int number = 10;
        // using specifiers to print the integer
       System.out.printf("%d*1=%d*1\n",number,2);

        // Why we are using this?
        // Formatting purpose

        String name = "Mamitha"; // declaration of a string variable

        System.out.println("Your name is -> " + name);

        // Printing using printf specifier
        System.out.printf("Your name is -> %s\n",name);


        float pi = 3.14159f;
        System.out.printf("Your value is  %f\n",pi);
    }
}
