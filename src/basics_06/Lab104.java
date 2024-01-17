package src.basics_06;

public class Lab104 {
    public static void main(String[] args) {

        int[] int_array = {34, 45, 46};
        long[] l_array  = {34l, 45l,43l};
        float[] f_array = {45.56f, 32.34f, 43.43f};
        double[] d_array = {34.3, 43.4, 12.32};
        boolean[] b_array ={true,false,false,true};
        char[] c_array = {'A','B','C'};
        String[] s_array = {"Mamitha","Vimal","Shailu","Manisha"};

        System.out.println(int_array.length);
        System.out.println(s_array.length);
//enhanced for loop
        for (String s : s_array) {
            System.out.println(s);
        }



    }
}
