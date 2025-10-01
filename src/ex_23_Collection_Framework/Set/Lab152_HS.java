package ex_23_Collection_Framework.Set;

import java.util.HashSet;
import java.util.Set;

public class Lab152_HS {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Orange");
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");
        System.out.println("Set elements:"+ set);
    }
}
