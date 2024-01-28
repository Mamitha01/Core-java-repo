package src.Oops_13th_Jan;

public class IV3 {
    public static void main(String[] args) {
        P03 h = null; // error - null pointer exception
        P03 h2=new P03();
        // System.out.println(h.a);
        System.out.println(h2.a);

    }
}

class P03{
    int a;
}
