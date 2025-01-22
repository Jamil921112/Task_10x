package ex_terop_practice;

public class Lab_012_ageClassification {
    public static void main(String[] args) {
        //age classification
       int age = 26;
       //Adult,minor,senior
        //minor <18
        // Adult >18
        //senior>65
        String result = (age<18)? "minor" :(age <65)? "adult" : "senior";
        System.out.println(result);
    }
}
