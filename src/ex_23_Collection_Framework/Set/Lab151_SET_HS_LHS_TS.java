package ex_23_Collection_Framework.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab151_SET_HS_LHS_TS {
    public static void main(String[] args) {
        Set<String> hs = new HashSet();
        // NO ORDER of element when stored
        // No duplicates
        hs.add("Apple");
        hs.add("Orange");
        hs.add("Watermelon");
       // hs.add(123);
        hs.add("Watermelon");
        hs.add(null);
        System.out.println(hs);
        System.out.println("--------------");

        Set lhs = new LinkedHashSet();

        lhs .add("Apple");
        lhs.add("Orange");
        lhs.add("Watermelon");//NO Duplicates ,order is maintained
        lhs.add("Dapple");
        lhs.add("Apple");
        // hs.add(123);
        System.out.println(lhs);
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.size());

        System.out.println("-------");

        Set ts = new TreeSet();
       ts .add("Apple");
        ts.add("Orange");
        ts.add("Watermelon");//NO Duplicates ,order is maintained
        ts.add("Dapple");
        ts.add("Apple");
//        ts.add(1230);java.lang.ClassCastException
  //        ts.add(null);//java.lang.NullPointerException
        System.out.println(ts);// sorting happen

        System.out.println("----For Each-----");
        for (Object O:ts){
            System.out.println(O);
        }



    }
}
