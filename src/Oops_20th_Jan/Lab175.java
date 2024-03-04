package src.Oops_20th_Jan;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Lab175 {
    public static void main(String[] args) {

        String path ="C:/A.txt";
        try{
            FileInputStream f = new FileInputStream(path);
        }catch (FileNotFoundException o){
            throw new RuntimeException(o);
        }

    }
}
