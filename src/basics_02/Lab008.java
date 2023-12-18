package src.basics_02;

public class Lab008 {
    public static void main(String[] args) {

        //without using final we can modify the value in the variable
        float pi = 3.145f;
        System.out.println(pi);

        pi = 3.45f;
        System.out.println(pi);


//    value cannot be changed when final is used

        final String STR="TTA";
        final double D1=999.99;

        System.out.println(STR);
        System.out.println(D1);



    }
}
