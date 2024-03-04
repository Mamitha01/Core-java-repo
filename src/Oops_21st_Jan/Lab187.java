package src.Oops_21st_Jan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab187 {
    public static void main(String[] args) {

        List<Integer> myMakrs = new ArrayList<>();
        myMakrs.add(91);
        myMakrs.add(87);
        myMakrs.add(80);
        Collections.sort(myMakrs);
        System.out.println(myMakrs);
    }
}
