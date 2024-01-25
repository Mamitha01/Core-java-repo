package src.OOPs_6th_Jan.basics;

public class Lab133 {
    public static void main(String[] args) {


        // Immutable in nature (that can't changed)
        String s1 = "Mamitha";
        String s2 = new String("mamitha");


        // Mutable - that can be changed!!

//        StringBuffer sbuf4 = new StringBuffer("Pramod");


        StringBuilder sb3 = new StringBuilder("Mamitha");
        sb3.append(" Meenakshi");
        System.out.println(sb3);


        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);

    }
}
