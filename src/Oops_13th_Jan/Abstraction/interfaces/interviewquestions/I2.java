package src.Oops_13th_Jan.Abstraction.interfaces.interviewquestions;

public class I2 {
    public static void main(String[] args) {
        Hello h= new Hello();
        h.say();
        h.hello();
    }
}

interface I1{
    void say();
    default void hello(){
        System.out.println("Hello Default");
    }
}


interface P{

}


class Hello implements I1{

public void say(){
    System.out.println("Say!");
}

public void hello(){
    System.out.println("yes, Hello");
}

        }