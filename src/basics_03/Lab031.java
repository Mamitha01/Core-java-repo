package src.basics_03;

public class Lab031 {
    public static void main(String[] args) {


            String name = "The Testing Academy";
            String name1 = "Academy";
        // when new is used the string is stored in Heap area
            String name2 = new String("The Testing academy");

       System.out.println(name == name1);
        System.out.println(name.equals(name1));


        System.out.println(name == name2); // false because it's case sensitive

            System.out.println(name.equals(name2));
            System.out.println(name.equalsIgnoreCase(name2)); // ignore the case sensitivty
    }
}
