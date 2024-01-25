package src.Oops_7th_Jan;

public class person {

    String name;

    person(){
        System.out.println("DC");
    }

    person(String name_ref){
        this.name = name_ref;
        System.out.println("PC");
    }

    person(String name_ref,String age){
        this.name =name_ref;
    }

    person(String name_ref, long number ,int rollno){
        this.name =name_ref;
    }


    void printDetails(){
        System.out.println("Name is -----> "+ this.name);
    }

    void printDetails(String name){
        System.out.println("Name is -------->"+ this.name);
    }

    int printDetails(int age){
        System.out.println("Name is ---------> "+ this.name);
        return 99;
    }
}
