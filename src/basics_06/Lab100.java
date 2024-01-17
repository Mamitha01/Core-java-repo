package src.basics_06;

public class Lab100 {
    public static void main(String[] args) {

        int[] arr1= {1,2,3,4,5};
        int[] arr2= {1,2,3,4,5};

        System.out.println(arr1==arr2); //their values don't match because of different ref --> false

        int[] arr3 = arr1;
        System.out.println(arr1==arr3); //their values n ref are same --> true

        System.out.println(arr1.equals(arr2)); //their values don't match because of different ref --> false
        // If String -> True Why - Values
        // Arrays -> Compare Don't -> Ref - Not equal

        arr3[0] = 24;
        System.out.println(arr1[0]);
        System.out.println(arr3[0]);
    }
}
