package ex_21_Exception;

public class Lab_122 {
    public static void main(String[] args) {
        int a =10;
        int b = 0;
        int c =a/b;
        System.out.println(c);//
        //ArithmeticException: / by zero -> UNCHECKED -JVM doesn't know
        String Name = null;
        Name.trim();//NullPointerException: Cannot invoke "String.trim()"
    }
}
