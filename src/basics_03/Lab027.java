package src.basics_03;

public class Lab027 {
    public static void main(String[] args) {

        String s1 = "Mamitha";
        // String Constant Pool - SCP / String Pool

        // new Operator - Object
        String s2 = new String("Mamitha");

        // s2 string is stored in heap
        //new operator is used to create the new object for class.
        // It returns the address of newly created object.
        System.out.println(s2);
        System.out.println(new String("Mamitha"));
    }
}
