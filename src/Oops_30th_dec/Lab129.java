package src.Oops_30th_dec;

public class Lab129 {
    public static void main(String[] args) {

        String name = "Mamitha"; // M a m i t h a

        String y = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            y = y + name.charAt(i);
        }
        System.out.println(y);

    }
}
