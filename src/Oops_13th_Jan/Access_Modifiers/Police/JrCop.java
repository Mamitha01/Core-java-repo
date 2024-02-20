package src.Oops_13th_Jan.Access_Modifiers.Police;

public class JrCop {
    public static void main(String[] args) {
        Cop jrcop = new Cop(2);
        System.out.println(jrcop.gun);
        jrcop.canishoot();

    }
}
