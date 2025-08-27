package ex_16_OPPS_Constructor;

public class Lab_89_PARA_const {
    public static void main(String[] args) {
        Mobile Iphone  = new Mobile("Iphone","2024");
        Mobile oneplus = new Mobile("oneplusT","2014");
        Mobile Oppo = new Mobile("OPPO C25","2012");
        System.out.println(oneplus.model_name);
        System.out.println(Iphone.model_name);
        System.out.println(Iphone.Year_of_Launch);
        System.out.println(Oppo.model_name);
        System.out.println(Oppo.Year_of_Launch);
    }
}
    class  Mobile{
      String model_name= "OPPO"; //if u assigned the value of value
        //  then every object  has same value
      String Year_of_Launch = "2024";

      Mobile (String model_name_c , String Year_of_Launch_c){
          this.model_name = model_name_c;
          this.Year_of_Launch =Year_of_Launch_c;
      }

    }