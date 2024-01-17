package src.basics_05;

public class Lab091 {
    public static void main(String[] args) {

        for(int i= 0; i<=10; i++){
            System.out.println(i);

        }
    //    System.out.println(i); cannot access i


        int j=11;
        while(j>10){
            System.out.println(j);
            j++;
        }
        System.out.println(j); // can access outside the loop too
    }
}
