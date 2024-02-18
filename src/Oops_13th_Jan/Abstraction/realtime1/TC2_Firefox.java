package src.Oops_13th_Jan.Abstraction.realtime1;

public class TC2_Firefox extends BaseClass{
    @Override
    String openbrowser() {
        System.out.println("Starting Firefox");
        return null;
    }

    @Override
    String closebrowser() {
        System.out.println("Closing Firefox");
        return null;
    }
}
