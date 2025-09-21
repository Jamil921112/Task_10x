package ex_19_Enum;

public class  Lab_116_P2 {
    public static void main(String[] args) {
        System.out.println(URLS.google);
        if (URLS.katalon.equals("katalon")) {
            System.out.println("I want do something");
            System.out.println(Locators.page_button.getLocater());
        }
    }
}
    enum URLS {
        google, restassured, katalon, vwo
        //katalon("https://katalon.com");

    }


        enum Locators{
        page_button("#btn"),
            page_Input("#input1");

            private String locater;
        Locators(String locater){
            this.locater=locater;
        }
        String getLocater(){
            return this.locater;
        }
        }
        // Property reader - can read the external file -Collection Framework
//    data properties   key & value