package src.Oops_14th_Jan.wrapperclass;

public class Lab164 {
    public static void main(String[] args) {

        //        System.out.println(StaticDemo.college_name);
//        StaticDemo.printName();

        Staticdemo s1 = new Staticdemo();
        s1.version =99;
        s1.printversion();


        Staticdemo.college_name ="TTA";
        Staticdemo s2 = new Staticdemo();
        s2.version = 299;
        s2.printversion();

    }


}
