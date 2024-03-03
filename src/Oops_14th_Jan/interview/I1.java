package src.Oops_14th_Jan.interview;

public class I1 {
    public static void main(String[] args) {

        System.out.println(H.a);
        mamitha m = new mamitha();
        m.m1();

    }
}

interface H{
    // only static variables

    int a = 10;
    public static final int b =20;
    public static final int c =30;
    void m1();// This is non static

}

class mamitha implements H{

    @Override
    public void m1() {

    }
}