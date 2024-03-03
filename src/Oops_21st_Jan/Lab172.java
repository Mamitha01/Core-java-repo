package src.Oops_21st_Jan;
import java.io.File;
import java.io.FileReader;
public class Lab172 {
    public static void main(String[] args) throws Exception {
main("A.txt");
    }
static void main (String a) throws Exception{
    //code 100
    //101
    FileReader f = new FileReader(new File("C://A.txt"));
    if(a.equalsIgnoreCase("a")) {
        throw new ArithmeticException();
    }
    ////code 100
    }
}
