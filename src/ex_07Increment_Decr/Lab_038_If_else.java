package ex_07Increment_Decr;

import java.util.Scanner;

public class Lab_038_If_else {
    // Create  a program  using user inputAdd commentMore actions
    // Check  whether the input is even or odd

    //Step -1  Figure out inputs or outputs
    // number (int)-> i/o-> Scanner Class can be used   for input
    // String-> odd or even -.> o/p ,println
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) {

            System.out.println("even");
        } else {
            System.out.println("odd");
            sc.close();
        }

    }

}
