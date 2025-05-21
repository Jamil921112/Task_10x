package ex_05_TypeCasting;

public class Lab_027_Narrowing_TypeCasting {
    public static void main(String[] args) {
        int val = 200;
       // byte b = val; Invalid -Implicit Casting
                        // narrowing is not possible
        byte b = (byte) val;// Valid-Explicit Casting -IS allowed
       // data loss
    }
}
