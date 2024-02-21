package src.Oops_14th_Jan;

public class Staticdemo {

    // Static variable
    public static String collegename = "thetestingacademy";

    // Non static variable -> Local variable or Instance variable
    public int version = 3;

    // Static method

    public static void printname(){
        int age = 40;
        System.out.println("Name is "+ collegename);
        // You can't have an Instance variable into the Static Method!!
        //System.out.println("Version is : " + version);
    }

    // Non static method
    public void printVersion() {
        int age = 40;
        System.out.println("Version is : " + version);
        System.out.println("Name is :" + collegename);
    }


}
