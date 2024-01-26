package src.Oops_7th_Jan.inheritance;

public class Lab146 {
    public static void main(String[] args) {


        // ## What is Inheritance?
        // Inheritance provides a way to create a new class from an existing class
        // SuperClass | Parent Class | Base Class
        // SubClass | Child Class | Derived Class
        // The extends Keyword

        // SubClass extends SuperClass{
        ////contents of SubClass
        //}


        Programming p = new Programming(); // Parent Class/ SuperClass / Base Class
        // How JVM understand this program

        // Programming - Class
        // p ->  ref to the Object
        // new Programming() ->  Object
        // DC is called

        p.printinfo();


        Programming p2 = new Programming("Perl", 12);
        // How JVM understand this program

        // Programming - Class - Class Loader
        // p2 ->  ref to the Object
        // new Programming() ->  Object
        // Param - Constructor - Called!!


        p2.printinfo();

    }
}

