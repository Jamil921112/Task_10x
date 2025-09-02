package ex_16_OPPS_Part2.Poly.Poly_MethodOverridding;

public class Lab_96 {
    public static void main(String[] args) {
        Father F1 = new Father();
        F1.Home();
        Child P1 = new Child();
        P1.Home();

        Father F2 = new Child();// Dynamic Dispatch
        F2.Home();  // Child Object with Father Referrence


    }
}