package ex_16_OPPS_Part2.Poly.Poly_MethodOverridding;

public class Real_Example {
    public static void main(String[] args) {
     TC t1 = new TC();
     t1.OpenBrowser();

     TC t2 = new TC();
     t2.OpenBrowser();

    }
}
  class CommonToAll{
    void OpenBrowser(){
        System.out.println("Open the browser in  5s");
    }
  }
    class TC extends CommonToAll{
      void StartTC(){
          OpenBrowser();
      }
    }

 class TC2 extends CommonToAll{
    @Override
    void OpenBrowser(){
        System.out.println("Open Browser In 2 sec");
    }
 }
