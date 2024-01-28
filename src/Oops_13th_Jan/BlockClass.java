package src.Oops_13th_Jan;

public class BlockClass {

    { // Instance Initialization Block
        System.out.println("I am IIB");
    }


    BlockClass (){
        System.out.println("I'm DC");
    }

    static{
        System.out.println("I'm SIB--Static initialization block");
    }
}
