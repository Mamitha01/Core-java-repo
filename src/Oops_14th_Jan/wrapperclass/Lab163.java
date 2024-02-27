package src.Oops_14th_Jan.wrapperclass;

public class Lab163 {
    public static void main(String[] args) {

        int a =10;

        Integer a1 =Integer.valueOf(a);
        // wrapper class we use in collection framework


        // Collection Framework -> Class -> Hate primitive data type
        // You have to use the Wrapper classes in Collection.


        Character s = 'a';

        // unboxing - Character object to primitive conversion


        char a3 = s;

        System.out.println(Integer.valueOf("55"));
        System.out.println(Integer.max(35,45));
        System.out.println(Integer.min(35,55));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        double d =45.2;
        String st2 =String.valueOf(d);

        Double st = Double.valueOf(d);
        Integer a22 = st.intValue();
        System.out.println(a22);

    }
}
