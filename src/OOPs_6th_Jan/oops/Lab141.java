package src.OOPs_6th_Jan.oops;

import src.OOPs_6th_Jan.basics.Person;

public class Lab141 {
    public static void main(String[] args) {
        // Person - class blueprint
        // p - ref variable
        // new Person() - Object Real
        // OOPs concept


        Person1 p = new Person1();
        p.name = "Mamitha";
        System.out.println(p.name);

        Person1 p1 = new Person1();
        p1.name = "Vimal";
        System.out.println(p1.name);

        new Person(); // object -> new Object
        // Person(); -> Method or Function
        Person p3 = null;
        System.out.println("End of the Program");


        // p,p2 and p3 - Ref -
        // p -> Mamitha , p2 -> Vimal, p3 -> null


    }
}
