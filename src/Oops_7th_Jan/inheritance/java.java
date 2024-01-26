package src.Oops_7th_Jan.inheritance;

public class java extends Programming {

    String newversion;

    java(){
        System.out.println("DC");
    }

    java(String version){
        this.newversion = version;
        System.out.println("PC");
    }

    void printinfo(){
        System.out.println("New version is ---> "+ this.newversion);
    }
}
