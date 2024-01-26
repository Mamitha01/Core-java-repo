package src.Oops_7th_Jan.inheritance;

public class Programming {

    int version;
    String author;

    Programming(){
        System.out.println("Dc");
    }

    Programming(String author1, int version1){
        this.author = author1;
        this.version = version1;

        System.out.println("PC");
    }

    void printinfo(){
        System.out.println("Program info--> "+ this.version+ "Author -------> "+this.author);
    }


    void car(){
        System.out.println("RR");
    }

    void house(){
        System.out.println("Bungalow");
    }
}
