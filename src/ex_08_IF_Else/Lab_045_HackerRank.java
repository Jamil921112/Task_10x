package ex_08_IF_Else;

import java.util.Scanner;

public class Lab_045_HackerRank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score");
        int score = sc.nextInt();
       char grade;

        if (score >= 90 && score <= 100) {
            System.out.println("Grade A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Grade B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Grade C");
        }
         else if (score>=60&& score<=69) {
            System.out.println("Grade D");

        } else if (score<=0 && score >100) {
            System.out.println("Brilliant");
        } else {
            System.out.println("fail");

        }
     sc.close();

    }

    }









