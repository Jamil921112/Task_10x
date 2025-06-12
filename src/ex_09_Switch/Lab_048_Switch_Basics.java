package ex_09_Switch;


import java.util.Scanner;

public class Lab_048_Switch_Basics {
    public static void main(String[] args) {
        //     User - Enter int number from 1 to 7
        // which day it is
        //1 ->mon ,-> thur ...-8,9 ,-1 Invalid
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number (1 to 7)");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4 :
                System.out.println("thu");
                break;
            case 5 :
                System.out.println("fri");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("sun");
                break;
            default :
                System.out.println("No, what day it is");
                break;
        }
    }

}