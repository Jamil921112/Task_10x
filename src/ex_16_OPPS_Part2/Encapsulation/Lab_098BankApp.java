package ex_16_OPPS_Part2.Encapsulation;

public class Lab_098BankApp {
    public static void main(String[] args) {

        ICICBank amit = new ICICBank(100, "Amit");
        System.out.println(amit.getBal());
        amit.setBal(1000, false);

        boolean isCashier = true;
        amit.setBal(1000, isCashier);
        System.out.println(amit.getBal() );
        System.out.println("BankName");



    }
}
     class ICICBank {
     // Bundling of data and methods that opoerate
         // on tha data within a single unit
         // data member should be private in nature.
         // Methods  with Getter and Setter only,
         // you can access the data members/ attributes

         private String name;
       private   long bal;
       public   String BankName = "ICICI";
          // constructer set

         public ICICBank(long bal, String name) {
             this.bal = bal;
             this.name = name;
         }

         public String getName() {
             return name;
         }

         public void setName(String name) {
             this.name = name;
         }

         public long getBal() {
             return bal;
         }

         public void setBal(long bal , boolean isCashier) {
             if(isCashier) {
                 this.bal = bal;
             }
             else {
                 System.out.println(" Not allowed to change the balance");
             }
         }
     }
