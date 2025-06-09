package ex_08_IF_Else;

import java.util.Scanner;

public class Lab_043_Odd_Even {
    public static void main(String[] args) {
        // Create a program - Take user Input
        // Check Whether the Input is even or Odd

        //  Step 1 - figure out inp and out
      //   number (int) ->i/o - Scanner class used
        //   to take input output
        //  step 2 - logic rough
        // num%2 =0 even , mod -R == 0
        // NUM% 2 !=0 odd
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        // step 3 write the logic
         if (num%2==0 ) {
             System.out.println("even");
         }
         else {
             System.out.println(" odd ");
         }
         sc.close();// stop the input
        // edge Cases
        // Large int, -ve integer ,zero , other input



    }
}
