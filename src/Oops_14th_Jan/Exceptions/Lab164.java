package src.Oops_14th_Jan.Exceptions;
import java.io.FileInputStream;

public class Lab164 {
    public static void main(String[] args) {

        //Unchecked Exception , Runtime
        String name = null;
        name.trim();// Unchecked? Runtime
        // .NullPointerException Error

        //Checked Exception , Compile Time -/JVM? If Knows about it, - Checked Exception
//        try{
//        FileInputStream f = new FileInputStream("dasda.txt");
//        }catch (Exception e){
    }
}
