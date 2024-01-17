package src.basics_06;

public class Lab099 {
    public static void main(String[] args) {

        int[] marks_10={50,65,75,45,88,68};
        System.out.println(marks_10[0]);
        System.out.println(marks_10[1]);
        System.out.println(marks_10[2]);
        System.out.println(marks_10[3]);
      //  System.out.println(marks_10[7]); // Exception in thread "main"
        // Index - 0 to (length -1)


        int[] a= new int[4];
        // empty array of length 4 is created

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);

        //initializing the arrays with its indexes
        a[0]=75;
        a[1]=68;
        a[2]=88;
        a[3]=56;
        System.out.println(a[0]);

        final int[] b = new int[4];
        //final keyword
        // b -> [0,0,0,0]
        b[0] = 78;
        System.out.println(b[0]);
        b[0]=88;
        System.out.println(b[0]);

    }
}
