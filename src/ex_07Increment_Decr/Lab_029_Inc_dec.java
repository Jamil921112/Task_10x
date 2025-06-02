package ex_07Increment_Decr;

public class Lab_029_Inc_dec{
    public static void main(String[] args) {
        int a = 10; //Add commentMore actions
        System.out.println(a++ + ++a);
        System.out.println(a);

        // a++ -> A -> ExpA -> 10, a -> 11
        // +
        // ++a -> B -> ExpB -> 12 , a -> 12
        // ExpA + ExpB -> 10+12 -> 22

    }
}

