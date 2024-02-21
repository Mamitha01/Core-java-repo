package src.Oops_13th_Jan.Encapsulation;


public class Lab147 {
    public static void main(String[] args) {

        Student1 s1 = new Student1();
        s1.name= "Mamitha";
        s1.name = "Shailu";
        s1.age =25;
        s1.print();
       // System.out.println(s1.name);



        // Getter and setter - Condition Based
        // They should hidden

        PersonS personS = new PersonS();
        personS.id = 1;
        personS.id= 99;
        personS.id = -1;
        personS.id =999;
        System.out.println(personS.id);

    }





}
