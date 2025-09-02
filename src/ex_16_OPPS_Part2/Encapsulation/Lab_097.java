package ex_16_OPPS_Part2.Encapsulation;

public class Lab_097 {
    public static void main(String[] args) {
        VWOLogin vwoLogin =   new  VWOLogin( "admin","123" );
        System.out.println(vwoLogin.Password);
           vwoLogin.Password = "345";
        System.out.println(vwoLogin.Password);

        GoodEncaVWOLogin vwoLogin1 = new GoodEncaVWOLogin("admin","123");
       // System.out.println(vwoLogin1.setPassword());
        vwoLogin1.setUsername("ashira");
     //   System.out.println(vwoLogin1.setUsername());
        // vwoLogin1.setPassword("123");
        boolean isAdmin = true;
        vwoLogin1.setPassword("123",false);
        System.out.println(vwoLogin1.getPassword());
    }
}
class VWOLogin {
    public String username;
    public String Password;

    public VWOLogin(String usr, String paswd) {
        this.username = usr;
        Password = paswd;
    }
}

     class GoodEncaVWOLogin{
        private String username;
        private String password;

         public String getUsername() {
             return username;
         }

         public void setUsername(String username) {
             this.username = username;
         }

         public String getPassword() {
             return password;
         }

         public void setPassword(String password , boolean isAdmin) {
             if (isAdmin){
             this.password = password;
         } else {
                 System.out.println("Not allowed change password");
             }

         }

         public GoodEncaVWOLogin(String usrn, String paswd) {
             this.username = usrn;
             this.password = paswd;
         }
     }

