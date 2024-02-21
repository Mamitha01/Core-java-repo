package src.Oops_14th_Jan;

public class Lab151 {
    public static void main(String[] args) {
        // System.out.println(StaticDemo.college_name);
        //StaticDemo.printName();

        Staticdemo s1 = new Staticdemo();
        s1.version =99;
        s1.printVersion();

        Staticdemo.collegename = "TTA";

        Staticdemo s2 = new Staticdemo();
        s2.version = 89;
        s2.printVersion();
    }
}
