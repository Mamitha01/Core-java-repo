package src.Oops_14th_Jan.wrapperclass;

public class Staticdemo {

    //Static variable
    public static String college_name = "Testing academy";


    // Non static variable -> Local variable or Instance variable
    public int version = 3;

    // Static method
    public static void printname(){
        int age =30;
        System.out.println("Name is "+ college_name);
        // You can't have an Instance variable into the Static Method!!
        //System.out.println("Version is : " + version);
    }

    //nonStatic method

    public void printversion(){
        int age =40;
        System.out.println("version is "+ version);
        System.out.println("Name is "+ college_name);
    }


}
