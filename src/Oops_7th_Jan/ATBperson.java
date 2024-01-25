package src.Oops_7th_Jan;

public class ATBperson {

    String name;
    long number;
    String email;
    boolean isMarried;
    String Coursename;


    // Default Constructor
    ATBperson(){
        Coursename =" ATB5x";
        System.out.println("I am Default");
    }

    // Param Constructor

    ATBperson(String valuefromObjectRef){
        this.name = valuefromObjectRef;

    }

    void talk(){
        System.out.println("I can talk");
    }

    void walk(){
        System.out.println("I can walk");
    }

    void printDetails(){
        System.out.println(this.name);
        System.out.println(this.number);
        System.out.println(Coursename);
    }

}
