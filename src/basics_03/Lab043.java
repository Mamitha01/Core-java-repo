package src.basics_03;

public class Lab043 {
    public static void main(String[] args) {

        // Decrement operator.

        int b = 20;
        System.out.println(--b + b++ + ++b);
        System.out.println(b);

        // A -> --b , Exp ->19 , b ->19
        // B -> b++ , Exp -->19 , b ->  20
        // C---> ++b , Exp -> 21 , b --> 21
        //Exp --> 59 , b --> 21
    }

}
