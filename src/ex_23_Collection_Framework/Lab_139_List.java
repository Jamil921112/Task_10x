package ex_23_Collection_Framework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab_139_List {
    public static void main(String[] args) {
        List mylist = new ArrayList(5);
        List mylist0 = new ArrayList();// Array Formats-continuos

        List mylist1 = new LinkedList();
        mylist1.add("pramod");
        mylist1.add("dutta");
        mylist1.add("menu");
        mylist1.add("renu");
        mylist1.add("renu");
        mylist1.add(123);
        mylist1.add(true);
        mylist1.add(null);

        System.out.println(mylist1);
        System.out.println(mylist1.size());
        System.out.println(mylist1.isEmpty());
        System.out.println(mylist1.indexOf("pramod"));
        System.out.println(mylist1.removeFirst());
        System.out.println(mylist1.contains("dutta"));

    }
}
