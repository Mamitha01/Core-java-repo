package src.OOPs_6th_Jan.basics;

public class Lab132 {
    public static void main(String[] args) {


        String s1 = "Mamitha";
        String s2 = new String("Mamitha");
        String s3 = new String("mamitha");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));


        System.out.println(s1.equalsIgnoreCase(s3));

    }
}
