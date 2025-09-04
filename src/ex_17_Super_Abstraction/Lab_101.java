package ex_17_Super_Abstraction;

public class Lab_101 {
    public static void main(String[] args) {
       Car c1 = new Car(100);
        c1.dispaly();

    }
}
    class Vehicle {
        public int MaxSpeed = 180;

        void notest() {

        }

        Vehicle() {
            System.out.println("Default Constr");

        }

        Vehicle(int a) {
            System.out.println("para cons");

        }

        // Method overloading with  same name and function with different argument
        void message() {
            System.out.println("No Return , No Argument");
        }

        void message(int a) {
            System.out.println(" Pc - argument");
        }

        void dispaly() {
            System.out.println();
        }

    }    // single inheritance
    class Car  extends Vehicle{
        private int MaxSpeed = 200;

        Car(){
            super(100);
        }
        void test(){
        }

        Car (int a){
            System.out.println("PC Car");

        }

      @Override
        void dispaly(){
            System.out.println("Override Car");
          System.out.println(super.MaxSpeed);// parent Variable
          System.out.println(this.MaxSpeed);// my variable
          this.test();
          super.notest();

        }
   }

