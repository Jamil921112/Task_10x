package ex_16_OPPS_Part2.SuperKeyword;

public class Lab_100 {
    public static void main(String[] args) {
        Son S1 = new Son();
        S1.t1();
    }

}
 class Father {
    int gold =10;
    void Home(){
        System.out.println("Home Father ");

    } // super keyword ka kaam apne father ka methods ,attributes access karna
 }
  class  Son extends Father{
    void t1 (){
        super.Home();
        System.out.println(super.gold);
    }

  }