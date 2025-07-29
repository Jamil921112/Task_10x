package ex_16_OPPS_Constructor;

public class Lab_085_OPPs_Constructor {
    public static void main(String[] args) {
         A a1 = new A();
         A a12 = new A();
        System.out.println(a1);
        System.out.println(a12);
    }

}
class A {
    A() {
        System.out.println("DC");// Default Constructer

    }
}
