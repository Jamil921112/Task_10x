package ex_16_OPPS_Constructor;

import java.time.Year;

public class Car2 {
    String model;
    int year;


    Car2() {
        model ="XXXX";
        year = 1900;
        System.out.println("DC");

    }
    // Parameter - Constructor
    Car2(String model_name, int year_created){
       this.model =model_name;
       this.year= year_created;

    }

}
