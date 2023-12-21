package src.basics_03;

public class Lab042 {
    public static void main(String[] args) {

        // Decrement operator.

        int b = 30;
        System.out.println(--b + b--);
        System.out.println(b);

        // A -> --b - Exp -> 29 , b = 29
        // B -> b-- -> Exp -> 29 , b -> 28
        // Exp ---> 58 , b = 28

    }
}
