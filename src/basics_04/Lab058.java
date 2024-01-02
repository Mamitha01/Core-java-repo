package src.basics_04;

public class Lab058 {
    public static void main(String[] args) {
        // JDK 13
        int itemCode = 002;
        switch (itemCode) {
            case 001, 002, 003:
                System.out.println("It's an electronic gadget!");
                break;
            case 004, 005:
                System.out.println("It's a mechanical device!");
                break;
            default:
                System.out.println("It's a software product!");
        }
    }
}
