package src.Oops_7th_Jan;

public class Lab144 {
    public static void main(String[] args) {

        BankAccount sbi_ref = new BankAccount();
        sbi_ref.printDetails();

        System.out.println("----------------------");

        BankAccount HDFC_ref = new BankAccount("HDFC","hdfc1254");
        HDFC_ref.printDetails();

        System.out.println("-------------------------");

        BankAccount ICICI_ref = new BankAccount("ICICI","icici5486");
        ICICI_ref.bank_name ="ICICI01";
        ICICI_ref.printDetails();


        BankAccount yesbank_ref = new BankAccount("YES bANK","YES005");
        yesbank_ref.printDetails();



    }
}
