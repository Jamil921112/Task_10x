package ex_16_OPPS_Constructor;

import java.util.Scanner;

public class Lab_87_Car2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the model Name of Tesla");

        String model_name = sc.next();

        Car2 tesla = new Car2("Tesla 3",2025 );
        System.out.println(tesla.model);
        System.out.println(tesla.year);

        System.out.println("-->");
        System.out.println("Enter the Model Name of nano");
         Car2 nano = new Car2("nano tata",2014);
        System.out.println(nano.model);
        System.out.println(nano.year);

    }
}
