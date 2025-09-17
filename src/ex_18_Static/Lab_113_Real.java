package ex_18_Static;

public class Lab_113_Real {
}


 class ATB1{
     {
         System.out.println("IIB - this is called When object is created");
         //WHt is purpose here you can write the code
         // Related to it
         // start a website or anything before the starting
         //   web automation or api automation

     }
     static {
         System.out.println("Load the  class i will execute");


     }
     private String NAME;
    private String Phone ;
    static  String courseName = "ATBx";

     public String getNAME() {
         return NAME;
     }

     public void setNAME(String NAME) {
         this.NAME = NAME;
     }

     public String getPhone() {
         return Phone;
     }

     public void setPhone(String phone) {
         Phone = phone;
     }
  void  readDocument(){
      System.out.println("Non  static method");
      System.out.println(courseName);

     }
    static void doAssignment(){//
          // System.out.println(Phone);// Static Methodvariable Can't access the non static variable
        System.out.println("Do Assignment");
    }
 }
