package ex_17_Super_Abstraction;

public class  Lab_Interface_PI {
    public static void main(String[] args) {
        Car1 car = new Car1();
        car.drive();
    }
}
       class Car1 implements Engine1,Brakes{
           void  drive (){
               EngineStart();
               applyBrakes();
               EngineStop();
           }
           @Override
           public void EngineStop() {
               System.out.println("Engine Stop");

           }

           @Override
           public void EngineStart() {
               System.out.println("Engine start");

           }

           @Override
           public void applyBrakes() {
               System.out.println("apply brakes");
           }
       }




// Curly braces only in abstarct method , have Constructor
// Not in Interface method; Don't have constructer


    interface Engine1 {
     public     void EngineStart();

        void EngineStop();
    }

    interface Brakes {
        void applyBrakes();
    }
