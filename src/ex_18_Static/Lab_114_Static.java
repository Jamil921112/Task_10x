package ex_18_Static;

public class Lab_114_Static {
    public static void main(String[] args) {
        Automation T1 = new Automation();
        System.out.println(T1.driver);
        System.out.println(Automation.driver);
        Automation.driver="firefox";
        System.out.println(Automation.driver);
        System.out.println(Automation.driver2);
    }
}
   class Automation {
    static String driver = "Chrome";
    static String driver2;

}