package src.OOPs_6th.basics;

public class Lab131 {
    public static void main(String[] args) {


        String name = "Mamitha";
        System.out.println(name.concat(" Meenakshi"));
        System.out.println(name + " Vimal");
        System.out.println(name.contains("a"));
        System.out.println(name);

        String name2 = new String("Meenu");


        String expected_result = "password@123";
        String actual_result = "Password@123";
        if (expected_result.equalsIgnoreCase(actual_result)) {
            System.out.println("Yes");


        }
    }
}
