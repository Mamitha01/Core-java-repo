package src.Oops_7th_Jan;
import java.util.Scanner;

public class Lab145 {
    public static void main(String[] args) {


//        Person p = new Person();
//        new Person();
//        Person p;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name");
        String name = sc.next();

        person p1 = new person(name);
            p1.printDetails();



        System.out.println("Enter your second name");
        String name1 = sc.next();

        person p2 = new person(name1);
        p2.printDetails();


        // this ->

        // p3 -> name -> Amit -> this -> p3
        // p2 -> name -> Pramod -> this -> p2
        // p ->  name -> null -> this -> nothing


        sc.close();



    }
}
