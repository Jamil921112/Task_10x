package ex_18_Static;

import javax.lang.model.element.Name;

public class Lab_112_StaticP2 {
    public static void main(String[] args) {
        ATB Indu = new ATB(893654, "indu" );
        ATB Suty = new ATB(64622652,"Suty");
        System.out.println(Indu.Phone_nb);
        System.out.println(Indu.Name);
        System.out.println(ATB.course_name);// For both Course name will be same
       ATB.m1();
    }

}
  class ATB{
    static String course_name ="ATB";
     String Name ;
     int Phone_nb;

      public ATB(int Phone_p ,String Name){
          this.Phone_nb= Phone_p;
          this.Name= Name;
      }
       void Dispaly(){
           System.out.println(this.Phone_nb+ this.Name +course_name);
      }
      static void m1(){
          System.out.println("Mark Attendance");
      }
  }