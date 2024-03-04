package src.Collections_3rd_Feb;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class Lab192 {
    public static void main(String[] args) {
        Set courseSets = new LinkedHashSet();
        courseSets.add("ATB");
        courseSets.add("MTB");
        courseSets.add("LAPIT");
        courseSets.add("SDET Blueprint");
        courseSets.add("Java for Testers");

        System.out.println(courseSets);
    }
}
