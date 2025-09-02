package ex_16_OPPS_Part2.Poly.Poly_MethodOverloading;

public class Lab_95_MOveridding {
    public static void main(String[] args) {
        MathOperation m1 = new MathOperation();
        int r = m1.add(3, 4);
        System.out.println(r);
        int R2 = m1.add(4,4,8);
        System.out.println(R2);

        double D1 = m1.add(5.22,4.56);
        System.out.println(D1);

    }

}