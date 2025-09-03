package ex_16_OPPS_Part2.SuperKeyword;

import ex_16_OPPS_Part2.singleInheritance.real_example.Testcase2;

public class Lab_99 {
    public static void main(String[] args) {
        TestCase1 t1 = new TestCase1("chrome");
        t1.openBrowser();
        System.out.println("Test case T1 running");
        t1.CloseBrowser();
        System.out.println(t1.getBrowser());

         TestCase1 t2 = new TestCase1("edge");
          t2.openBrowser();
        System.out.println(t2.getBrowser());
    }
}


 class BaseClass{
    private String browser;

     public BaseClass(String browser) {
         this.browser = browser;
     }

     public String getBrowser() {
         return browser;
     }

     public void setBrowser(String browser, boolean isAdmin) {
         if(isAdmin){
         this.browser = browser;
     } else {
             System.out.println(" You r not an admin, you can't change the browser");
         }
 }
    void openBrowser(){
        System.out.println("Opening Browser !!");
    }
   void openBrowser( String browserName){
       System.out.println("Open browser!!-> "+ browserName);
     }
     void CloseBrowser(){
         System.out.println("Close  Browser ");
     }
}
class  TestCase1 extends BaseClass{

    public TestCase1(String browser){
        super(browser);// Call to my parent Constructer
    }

    @Override
    public void setBrowser(String browser, boolean isAdmin) {
        super.setBrowser(browser, isAdmin);
        System.out.println("Overi the parent Set Browser");
    }
}