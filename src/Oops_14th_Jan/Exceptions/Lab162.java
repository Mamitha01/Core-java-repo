package src.Oops_14th_Jan.Exceptions;

public class Lab162 {
    public static void main(String[] args) {

        // Exception -?>
//  event that occurs during the execution of a program
//  that disrupts the normal flow of instructions.

        try{
            String name = null;
            name.trim(); //100GB used stack over error
            System.out.println("I am Mamitha");
        }catch (Exception e){

            System.out.println("You are trying to trim a null string that is not possible in java!!");
        }
        System.out.println("Hi I am the End");
    }
}
