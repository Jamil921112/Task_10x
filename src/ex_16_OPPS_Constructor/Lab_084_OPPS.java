package ex_16_OPPS_Constructor;

public class Lab_084_OPPS {
    public static void main(String[] args) {

     Baby b1 = new Baby();
     new Baby();
     new  Baby();
     Baby b2;

    }
}
  class Baby {
String name ;
  Baby (){
      System.out.println(" I am Called , Object is Created!");
  }
      // Instance Initialization block
      {
          System.out.println("I am also called ,When the class is loaded");
      }
  }