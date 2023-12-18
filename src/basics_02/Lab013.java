package src.basics_02;

public class Lab013 {
    public static void main(String[] args) {

        //Escape sequence

        char c = '\n'; // New line / Next Line
        char c1 = '\t'; // Add Tab
        char c2 = '\b'; // Backlash, delete 1 char
        char c3 = '\r'; // Backlash, delete 1
        //like queue
        System.out.println("Mamitha" + "Meenakshi"+c3+"Vimal");
        System.out.println("Mamitha\tMeenakshi");
        System.out.println("Mam\"itha"); //To insert a double quote character in the text at this point.
        System.out.println("Mami\'tha"); //To insert a single quote character in the text at this point.
    }
}
