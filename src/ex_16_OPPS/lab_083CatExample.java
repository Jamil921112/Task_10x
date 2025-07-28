package ex_16_OPPS;

public class lab_083CatExample {
    public static void main(String[] args) {
     cat s1 = new cat();
     cat s2 = null;   //NullPointerException
     new cat();

     s1.running();
     s2.running();
    }
}
     class cat {
     String name;


     void running(){
         System.out.println("Running");
     }
     }
