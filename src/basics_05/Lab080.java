package src.basics_05;

public class Lab080 {
    public static void main(String[] args) {

        // Print the Odd and Even number in between the 1 to 50.
        // If Else
        for (int i = 0; i<=50; ++i) {
            if(i%2==0){ // !(i%2==1) OR (i%2==0)
                System.out.println(i+ " is Even!");
            }else{
                System.out.println(i+ " is Odd!");
            }
        }
        System.out.println(" --- End of Program!! --- ");
    }
}
