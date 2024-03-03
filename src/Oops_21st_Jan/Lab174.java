package src.Oops_21st_Jan;

public class Lab174 {
    public static void main(String[] args) throws CustomException {


        Bank jpchase = new Bank("USD", 100);
        Bank HDFC = new Bank("INR", 500);
        Bank ICICI = new Bank("INR", 300);

        System.out.println(HDFC.add(jpchase));
    }
}
