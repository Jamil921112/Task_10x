package ex_23_Collection_Framework;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab_144_Array_List_Input {
    public static void main(String[] args) {
        // ArrayLists based on the user defined categories

        // names ,ages - store them
        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        String continueInput = "Y";// Control variable for input

        while (continueInput.equalsIgnoreCase("Y")) {

            System.out.println("Enter name ");
            String name = sc.nextLine();
            names.add(name);

            System.out.println("Enter the age");
            int age = sc.nextInt();
            ages.add(age);// add ages to add list


            sc.nextLine();
            System.out.println("Do you want to enter another record? (Y/N)");
            continueInput = sc.nextLine();

        }
        for (Object O1 :names){
            System.out.println(O1);

        }
        for (Object O2:ages){
            System.out.println(O2);
        }

   sc.close();

    }
}
