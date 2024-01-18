package src.OOPs_6th.basics;

public class Lab136 {
    public static void main(String[] args) {

        // If something is Thread Safe, we avoid!
        // StringBuffer vs StringBuilder
        StringBuilder strB = new StringBuilder("Mamitha");
        strB.reverse();
        System.out.println(strB);

    }
}
