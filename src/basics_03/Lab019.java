package src.basics_03;

public class Lab019 {
    public static void main(String[] args) {
        // Interview Question - Relational Operator
//        System.out.println( 10 == 10);
//        System.out.println( 10 >= 10);
//        System.out.println( 10 <= 10);
//        System.out.println( 10 > 10);
//        System.out.println( 10 < 10);
//
//        System.out.println(" -------");
//
        //System.out.println('A' = 65); // Cannot asign on print statement
           System.out.println('A' == 65); // ASCII
        System.out.println('B'==66);
            System.out.println('A');
            System.out.println('S');

        byte b = 65;
        System.out.println('A' == b);
        System.out.println('A' == 65.0); // f or without f it be compared with the Ascii character
        System.out.println('A' == 65.0f);

        System.out.println('A' == 65.2);
        System.out.println('A' == 65.00000);

        //System.out.println(true == 0); a boolean value cannot be compared with a number
        //System.out.println(true >= true); a boolean value cannot be compared with another boolean value

    }
}
