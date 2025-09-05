package ex_17_Super_Abstraction;

public class Lab104_AC {
    public static void main(String[] args) {


        WagonR WagonR = new WagonR();
        WagonR.drive();
    }
}
  class WagonR extends Engine {

      @Override
      void EngineStart() {
          System.out.println("Start");
      }


      @Override
      void EngineStop() {
          System.out.println("Stop");

      }

      void drive() {
          EngineStart();
          System.out.println("I am Driving");
          EngineStop();

      }
  }

 abstract  class Engine{
    abstract void EngineStart();
    abstract void EngineStop();

 }
