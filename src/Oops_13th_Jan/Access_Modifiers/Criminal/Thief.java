package src.Oops_13th_Jan.Access_Modifiers.Criminal;
import src.Oops_13th_Jan.Access_Modifiers.Police.Cop;
public class Thief {
    public static void main(String[] args) {

        Cop cop = new Cop(10);
        System.out.println(cop.gun);
        //cop.canIShoot();
        //He is not in the Protect Police folder

    }


}
