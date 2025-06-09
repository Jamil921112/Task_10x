package ex_08_IF_Else;

import java.util.Scanner;

public class Lab_040_Age {
    public  static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age!");
        int age = sc.nextInt();

        if ( age >= 18){
            System.out.println("You can Vote");
        }
        else {
            System.out.println("You can't Vote");
        }




    }
}
