package ex_17_Super_Abstraction;

public class Lab_110 {
    public static void main(String[] args) {
        D integer = new D();
        Arshad integer1 =new  D();// Dynamic Dispatch with Interface
        integer.display();
        System.out.println(integer.a);
    }
}
class D implements Arshad{
    @Override
    public void display() {
        System.out.println("a");
    }
}
  interface Arshad{
   public int a =10;
    void display();

  }
