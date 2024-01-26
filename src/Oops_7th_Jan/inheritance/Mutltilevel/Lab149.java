package src.Oops_7th_Jan.inheritance.Mutltilevel;

public class Lab149 {
    public static void main(String[] args) {

//        GrandFather g = new GrandFather();
//        Father f = new Father();
//        Son s = new Son();
//
//
//        GrandFather g = new Son();
//
//
//        Father f = new Son();
//        // Son s  = new GrandFather();
//        // Son s = new Father();
//        Son s = new Son();


        Grandfather g = new Son();
        g.bhk3();

        System.out.println("------------------------");

        Son s = new Son();
        s.bhk1();
        s.bhk2();
        s.bhk3();


    }
}
