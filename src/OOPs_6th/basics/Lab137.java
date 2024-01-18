package src.OOPs_6th.basics;
import java.util.Scanner;
public class Lab137 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String, I will check for Palindrome");
        String user_input = scanner.next();
//        user_input = user_input.toLowerCase();
        boolean result = isPalindrome(user_input); // calling function
        if(result){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }

    }

    //function
   // static boolean isPalindrome(String userInput) {
     //   String original_str = userInput; //Pramod , naman
       // StringBuilder sb = new StringBuilder(userInput);
        //String reverse_string = sb.reverse().toString(); // domarP , naman
       // return original_str.equalsIgnoreCase(reverse_string); // domarp == Pramod , true

    static boolean isPalindrome(String userInput) {
        String orig_str = userInput;
        StringBuilder sb1 = new StringBuilder(userInput);
        String reverse_string = sb1.reverse().toString();
        return orig_str.equalsIgnoreCase(reverse_string);
    }


    }

