package src.basics_03;

public class Lab021 {
    public static void main(String[] args) {
        // ||--->  OR
        // 0 || 0 -> 0
        // 0 || 1 -> 1
        // 1 || 0 -> 1
        // 1 || 1 -> 1


        System.out.println(false || false);
        System.out.println(false || true);
        System.out.println(true || false);
        System.out.println(true || true);


        // && ---> AND

        // 0 && 0 -> 0
        // 0 && 1 -> 0
        // 1 && 0 -> 0
        // 1 && 1 -> 1

        System.out.println(false && false);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(true && true);

    }
}
