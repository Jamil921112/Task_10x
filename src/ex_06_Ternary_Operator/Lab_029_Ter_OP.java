package ex_06_Ternary_Operator;

public class Lab_029_Ter_OP {
    public static void main(String[] args) {
        // result = condition? expression 1 : expression 2 ;
        int age = 18 ;
        String CanIVote = age >=18 ?"Yes you can Vote":"No,You Can't Vote";
        System.out.println(CanIVote);
    }
}
