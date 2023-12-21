package src.basics_03;

public class Lab036 {
    public static void main(String[] args) {

        // Ternary operator.

        //int a =  condition ?  if true, print stmt1 :  If false, print stmt 2

        // MAX of three numbers

        int a = 20;
        int b = 30;
        int c = 72;

        // a > b && a> c or a

        // (a>c) ? a : c
        // ((b>c) ? b : c

        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println(max);

    }
}
