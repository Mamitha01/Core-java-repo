package src.Oops_21st_Jan;
import java.util.Enumeration;
import java.util.Vector;


public class Lab185 {
    public static void main(String[] args) {

        Vector<String> v2 = new Vector();
        v2.add("Mamitha");
        v2.add("ma");
        v2.add("adsda"); // Array - can store similar only

        Enumeration e  = v2.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
