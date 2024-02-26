package src.Oops_14th_Jan.innerclass;

public class Lab156 {
    public static void main(String[] args) {

        Mamitha.ipad i = new Mamitha.ipad();
        i.eating();

    }
}


class Mamitha{
    int a =10;// Data Memebers / Instances Variables

    void eat(){
        System.out.println("You can eat");
    }

    static class ipad{
        void eating(){
            System.out.println("I'm IPad");
        }
    }
}