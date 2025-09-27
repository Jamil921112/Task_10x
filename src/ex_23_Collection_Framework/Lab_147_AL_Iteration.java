package ex_23_Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab_147_AL_Iteration {
    public static void main(String[] args) {
        List<String> s1 = new ArrayList<>();
        s1.add("pramod");
        s1.add("preeti");
        s1.add("menu");

        System.out.println("--To print array List-");

        for (String list : s1) {
            System.out.println(list);
        }
        System.out.println("To print Array List 2");
//      Iterator
        Iterator<String> iterator = s1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
        for (int i = 0; i < s1.size(); i++) {
            System.out.println(s1.get(i));
        }
    }
}