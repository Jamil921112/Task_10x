package ex_15_Arrays;

import java.util.Scanner;

public class Lab74_UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        int []numbers = new int[size];
        for (int i =0 ; i < numbers.length ; i++){
            System.out.println("Enter the number");
            numbers[i] = sc.nextInt();
        }
      for (int i = 0 ; i< numbers.length; i++) {
          System.out.println(numbers[i]);
      }


    }
}
