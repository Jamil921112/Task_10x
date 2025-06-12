package ex_08_IF_Else;

import java.util.Scanner;

public class Lab_047_Hacker_RankQ2 {
    public static void main(String[] args) {

//✅ Triangle Classifier:

   //     Write a program that classifies a triangle based on its side lengths.
        //   Given three input values representing the lengths of the sides
        //   determine if the triangle is equilateral (all sides are equal),
        //   isosceles (exactly two sides are equal), or scalene (no sides are equal).
        //   Use an if-else statement to classify the triangle.
//  inp = side 1 ,side2 ,side3 -> data type - double
        // output -string or message -> Equilateral, Isosceles,Scalene
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenghth of side1:");
        double side1 = sc.nextDouble();

        System.out.println("Enter the lenghth of side2:");
        double side2 = sc.nextDouble();

        System.out.println("Enter the lenghth of side3:");
        double side3 = sc.nextDouble();

       // if (side1 == side2 and side 2 == side3 and side 1 == side 3 -> equi
        // side 1 == side2 || side 1==side3 || side 2 == side3 -> iso
        // else -> scalene
        if (side1 <=0 || side2 <=0 || side3 <=0 ){
            System.out.println(" Invalid , Length must be positive  ");
        }
         if (side1 == side2 && side2 == side3 && side1 == side3 ) {
            System.out.println("The triangle is Equilateral");
        } else if (side1 == side2 || side2 == side3 || side1 == side3 ) {
            System.out.println("The Triangle  is Isosceles");
        }
        else{
            System.out.println("Scalene Triangle");
        }
       sc.close();

    }
    }







