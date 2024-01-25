package src.Oops_7th_Jan;

public class BankAccount {
    String bank_name;
    int balance;
    String bank_code;

    BankAccount(){ // Default constructor
        bank_name ="SBI";
        bank_code ="SBI459";
        System.out.println("Default constructor");
    }

    BankAccount(String bank_name,String bank_code){
        this.bank_name = bank_name;
        this.bank_code = bank_code;
        System.out.println("Param Constructor");

    }

    void printDetails(){
        System.out.println("Bank name= "+ bank_name);
        System.out.println("Bank code= "+ bank_code);
        System.out.println("Balance= "+ balance);
    }
}
