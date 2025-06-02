package ex_06_Ternary_Operator;

public class Lab_036_Age_classification {
    public static void main(String[] args ) {
    int age = 25;
      // senior age > 65
      // adult age  > 18
      // minor age < 18
      String Result = (age < 18 )? "minor" : (age <65)? "adult" : "senior ";
        System.out.println(Result);

    }
}
