package ex_17_Super_Abstraction;

public class Lab_107_Multiple_Inheritance_Solved {
    public static void main(String[] args) {
    Child1 child1= new Child1();
    child1.Money();
    }
}
class Child1 implements Mother,Father1{
     @Override
    public void f1() {

    }

    @Override
    public void Money() {
        System.out.println("Only 1 Money");


    }

    @Override
    public void m1() {

    }
}

    interface Mother{
    void Money();
    void m1();
    }
    interface Father1 {
     void Money();
     void f1();

    }