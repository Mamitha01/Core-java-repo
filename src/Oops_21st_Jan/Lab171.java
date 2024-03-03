package src.Oops_21st_Jan;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class Lab171 {

    public static void main(String[] args) throws Exception {

        readFile("C://A.txt");
        // prone to error

    }

    static void readFile(String filename) throws Exception{
        int a =10/10;
        int c=0;
        int a1 =10/4;
        if(c==0){
            throw new ArithmeticException();
        }else{
            int a2 =10/c;
        }
        int a3 = 10/1;
        int a4 = 10/10;
    }
}


