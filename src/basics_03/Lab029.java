package src.basics_03;

public class Lab029 {
    public static void main(String[] args) {

        byte b=11;
        int a=b;                // VALID – Implicit Casting
        System.out.println(a);
        int a1= (int)b;        // VALID – Explicit Casting
        System.out.println(a1);

    }
}
