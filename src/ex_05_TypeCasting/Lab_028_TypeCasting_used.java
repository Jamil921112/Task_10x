package ex_05_TypeCasting;

public class Lab_028_TypeCasting_used {
    public static void main(String[] args) {
        //GST - 18.45
        int course = 100 ;
        float GST = 18.45f;
        float total =(course+GST);// widening Implicit
        System.out.println(total);
        // int total_int = course + GST ; // Narrowing - implicit not possible
        int total_int  = course + (int)GST;//narrow Explicit ,not advise
        System.out.println(total_int);
        float total_u = (float) course +GST; // widening - explicit (short to long)
        System.out.println(total_u);



    }
}
