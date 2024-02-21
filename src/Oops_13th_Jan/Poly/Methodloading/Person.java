package src.Oops_13th_Jan.Poly.Methodloading;

public class Person {
    // Method OverLoading -> multiple methods with same name, but different argument.

    void Gift (String a){
        System.out.println("A is String"+ a);
    }

    int Gift (int b){
        System.out.println("B is a integer"+ b);
        return b;
    }

    //    float Gift(float x){
//        System.out.println("X is a Float" +  x);
//        return x;
//    }


    int Gift(float x){
        System.out.println("X is a int"+x);
        return 89;
    }

    void Gift(double x){
        System.out.println("X is a double "+ x);
    }
}
