package src.OOPs_6th.basics;

public class Lab134 {
    public static void main(String[] args) {
        // Immutable in nature (that can't changed)
        String password = "password@123";

        // 1000 times I am going to change the password value
        // should I use the Sb, sb OR String

        // Mutable - that can be changed!!
        StringBuilder password2 = new StringBuilder("Mamitha");
        password2.append(" Meenakshi");
        System.out.println(password2);

    }
}
