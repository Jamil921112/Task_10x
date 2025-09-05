package ex_17_Super_Abstraction;

public class Lab_104_Abstract {
    public static void main(String[] args) {


        Child c = new Child();
        c.Left50k();
        c.Left25K();
        // Abstaract class dont have  any object
    }
}
  // abstract Classes
  abstract class Father {
     abstract void Left50k();
          void Left25K () {
              System.out.println("Given 25K");
          }
      }

      class  Child extends Father {
          void Left50k() {
              System.out.println("Child will pay the loan");

          }
      }