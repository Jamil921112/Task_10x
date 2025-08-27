package ex_16_OPPS_Part2.heirarical;

public class Lab_093_Hierarical {
    public static void main(String[] args) {
        Son S1 = new Son();
        S1.h2();
        S1.H1();

        Lucky L1 = new Lucky();
        L1.l2();
        L1.H1();

        Ruhani R1 = new Ruhani();
        R1.r1();
        R1.H1();      // One Father Multiple children


    }
}
