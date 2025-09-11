package ex_17_Super_Abstraction;

public class Lab_108AC {
    public static void main(String[] args) {

    }
}
  abstract class EngineAC{
    EngineAC(){
     // This is useless
    }
     abstract void startEngine();
   void stopEngine(){
          System.out.println("stop");
      }
  }
    interface Tyre{
    //void m1{}
      public void m2();
     // Tyre(){}  //No Constructer
    }


