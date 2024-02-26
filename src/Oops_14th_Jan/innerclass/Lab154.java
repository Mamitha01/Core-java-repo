package src.Oops_14th_Jan.innerclass;

public class Lab154 {
    public static void main(String[] args) {

Car c = new Car("Lambo143");
Car.Engine e = c.new Engine("440CC");
e.start();;
c.drive();

// OC.IC ref = OCRef.new IC();


    }
}

class Car{
    String make; //instance variable

    // param constructor

    public Car(String make){

        this.make =make;

    }

    // Method
    void drive(){
        System.out.println("You can drive the Car");
    }

    public class Engine{
        String horsepower; //instance variable

        //param constructor
        public Engine(String horsepower){
            this.horsepower =horsepower;
        }

        //method

        void start(){
            System.out.println("Engine is started"+ make);
        }

    }

}
