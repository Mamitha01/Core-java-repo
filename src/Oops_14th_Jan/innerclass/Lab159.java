package src.Oops_14th_Jan.innerclass;

public class Lab159 {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm a Thread");

            }
        };

        runnable.run();
    }
}
