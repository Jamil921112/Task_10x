package ex_06_Ternary_Operator;

public class Lab_033_Interview_NestedTO {
    public static void main(String[] args) {
        //Nested Ternary
        // result = condition ? expression1 : (condition2 ? expression2: );
        //result = condition1 ? expression1 : expression2;
        //expression - (condition2 ? expression2 : expression3)
      int number = 15 ;
      String result = (number > 10)?(number > 20 ? "G>20":"B/W 10 to 20"):"B";
        System.out.println(result);
    }
}
