package src.Oops_30th_dec;

public class Lab112 {
    public static int main(String[] args) {

        sayHello();

        int c = mamitha_sum();                        //no argument
        int c1 = mamitha_sum(2);                       //1 argument
        int c2 = mamitha_sum(1, 2);                       //2 argument
        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);


        return c;
    }


    static int mamitha_sum(int input_1, int input_2){ // Definition of the Function
        return input_1+input_2;
    }
    static int mamitha_sum(int input_1){
        return input_1;
    }

    static int mamitha_sum(){
        return 99;
    }

    static int mamitha_sum(int input_1, int input_2, int c){
        return input_1+input_2+c;
    }

    static void sayHello(){
        System.out.println("Say Yes");
    }

}




