package src.Oops_13th_Jan.Poly.Methodoverriding;

public class RC {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.bark();

        hound h = new hound();
        h.bark();


        Dog f  =  new hound(); // Dynamic Dispatch
        // Runtime Polymorphism
        f.bark();


        //Hound a = new Dog(); // Java 22 This is not possible
        // Latest java 22 - It is never possible in JAVA


    }


}
