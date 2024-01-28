package src.Oops_13th_Jan;

public class IV4 {
    public static void main(String[] args) {


        //System.out.println(P04.a); //not static variable so cannot used in static main function
        System.out.println(P04.b);
        P04.run2();
        System.out.println(" ");
        //System.out.println(P04.run()); //not static


    }
}

class P04 {
    int a;
    static int b;

    static void run2() {
        System.out.println("Hahah");
    }

    void run() {

    }
}
