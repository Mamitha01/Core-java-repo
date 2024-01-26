package src.Oops_7th_Jan.inheritance.hierarical;

public class Vehicle { //parent class


    Vehicle(){
        System.out.println("DC");
    }


    void vehiclehastopspeed(){
        System.out.println("Yeah from "+getClass().getName());
    }
}
