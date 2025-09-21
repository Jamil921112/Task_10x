package ex_21_Exception;

public class Lab_127_try_catch_finally {
    public static void main(String[] args) {
        int a =1;
        int b =0;
        try {
            b= 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("I will alwways be executed");
        }
        System.out.println(a);
    }
}
