package ex_08_IF_Else;

import java.util.Scanner;

public class Lab_044_If_ElseIf_Else {
    public static void main(String[] args) {
        //num1 > num2 -1
        // num1<num2 -2
        // num1== num2 -3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num 2");
        int num2 = sc.nextInt();

        if (num1> num2)   {
            System.out.println("num1");
        } else if (num1<num2) {
            System.out.println("num2");
        }  else{
                System.out.println("equal");
            }
        }

    }

