package ex_23_Collection_Framework.List;

import java.util.Stack;

public class Lab_148_Stack {
    public static void main(String[] args) {
        // last In First Out
      //  Stack s  = new Stack();
        //s.add("Pramod");
        // s.add("dutta");
     //   System.out.println(s);

        Stack S = new Stack();
        S.push("pramod");
        S.push("dutta");
       S.push("Amit");
        System.out.println(S);
        System.out.println(S.size());
        System.out.println(S.peek());
        System.out.println(S);
        System.out.println(S.pop());
        System.out.println(S);
        System.out.println(S.size());
        System.out.println(S.empty());
        System.out.println(S.add("Ashiya"));
        S.add("Ashiya");

        System.out.println(S);
        System.out.println(S.get(0));

    }
}
