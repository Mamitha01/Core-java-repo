package src.Oops_14th_Jan.innerclass;

public class Lab155 {
    public static void main(String[] args) {
    OOC ooc = new OOC();
    OOC.SNCI icerf = new OOC.SNCI();
    icerf.show();


    }
}


class OOC {
    static int s = 100;
    int a = 10;

    static class SNCI {


        void show() {
            //System.out.println(a);
            System.out.println(s);
        }
    }
}