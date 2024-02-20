package src.Oops_13th_Jan.Encapsulation;

public class ICICIbank {

    public String getname(){
        return name;
    }

    public ICICIbank(String name,long bal){
        this.name= name;
        this.bal = bal;
    }

    public void setname(){
        //this.name;

    }

    public long getbal(){
        return bal;
    }

    public void setbal(long bal){
        if(bal > 0) {
            this.bal = bal;
        }
        else{
            System.out.println("Not allowed!!");
        }
    }

    String name;
    long bal;
    }



