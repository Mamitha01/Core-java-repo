package src.Oops_7th_Jan;

public class Dog {
    String name;
    Dog(){ // Default constructor
        System.out.println("I can bark -DC");
    }

    Dog(String nameref){
        this.name = nameref;
        System.out.println("I can bark -PC");

    }

    void bark(){ //method
        int age =10;
        System.out.println("I can Sniff");
        System.out.println("Dog name is"+ this.name);

    }
}
