package src.Oops_13th_Jan;

public class IV1 {
    public static void main(String[] args) { //error when static is given -- non-static variable this cannot be referenced from a static context

        Person1 h=new Person1();
        System.out.println(h.a);

        Person1 h2=new Person1(23);
        System.out.println(h2.a);




        Person1 h3=new Person1(23,true);
//        System.out.println(h3.a);
//        System.out.println(h3.b);
        System.out.println(h.b);
        h.a=99;
        // h.b=true;
        System.out.println(h.a);
        System.out.println(h.b);









    }
}


class Person1 {
    int a;
    boolean b;

    // Default
    Person1(){
        this.a = 10;
    }

    // Parameter Constructor
    Person1(int b){
        this.a = b; //  h2.a
    }

    Person1(int b,boolean a){
        this.a = b;
        this.b = a;
    }
}
