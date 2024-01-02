package src.basics_04;

public class Lab057 {
    public static void main(String[] args) {

        byte b = 20;
        switch (b) {
            case 10:
                System.out.println("TEN");
                break;
            case 127:
                System.out.println("ONE TWENTY EIGHT");
                break;
            default:
                System.out.println("Default");
        }
    }
}
