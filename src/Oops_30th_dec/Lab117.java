package src.Oops_30th_dec;

public class Lab117 {
    public static void main(String[] args) {

        System.out.println("Run fine !!"); // printed

        int d = main(10);   //intializing and calling a function n is printed
        System.out.println(d);

        main("Mamitha"); // I am a Main function but JVM doesn't recognize me

    }

    static void main(String a){
        System.out.println("I am a Main function but JVM doesn't recognize me");
    }

    static int main(int b){
        return b+101;
    }

}
