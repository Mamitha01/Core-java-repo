package src.Oops_13th_Jan;

public class IV2 {
    public static void main(String[] args) {

        Person2 d = new Person2();
        Person2 d1 = new Person2();
        Person2 d2 = null; //error ----.NullPointerException
       // d2.run();
        d1.run();

    }
}

class Person2{
    int a;
    void run(){
        System.out.println("Run is called");
    }
}
