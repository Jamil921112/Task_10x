package ex_16_OPPS_Constructor;

public class Lab86_Car {
    public static void main(String[] args) {
      Lab_Car tesla = new Lab_Car();  // 1st Object
      tesla.name= "Tesla Model 3";
      tesla.year = 2025;
        System.out.println(tesla.name);
        System.out.println(tesla.year);
        System.out.println(tesla.model);

        System.out.println("-----");

       Lab_Car nano = new Lab_Car(); // 2nd Object
       nano.name ="Tata Nano";
        System.out.println(nano.name);

    }
}
