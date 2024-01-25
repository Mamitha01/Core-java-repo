package src.OOPs_6th_Jan.basics;

public class Lab130 {
    public static void main(String[] args) {


        String str = "Mamitha"; //String constant pool
        String str1 = new String("Shailu"); // Heap area

        str = "Vimal";
        str1 = "endar";
        System.out.println(str1);

        String name1 = "Shail";
        name1 = name1.concat(str);
        System.out.println(name1);




    }
}