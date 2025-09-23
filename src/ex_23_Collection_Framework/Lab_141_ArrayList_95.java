package ex_23_Collection_Framework;

import java.util.*;
import java.util.List;

public class Lab_141_ArrayList_95 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("bread");
        list.add("milk");
        list.add("paneer");
        list.add("Jam");
        list.add(123);
        list.add(null);
        System.out.println(list);
        System.out.println(list.size());
        // How to print
        System.out.println("-------");
        for (int i=0;i<list.size();i++){
            System.out.println(i);
        }
        System.out.println("---For  each loop");
        for (Object o:list){
            System.out.println(o);
        }
        System.out.println("--To print array list iterator ");
        // Iterator -go one by one forward -> get access them
        // HasNext()-> true- if we have a next element
        // Next -> element
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}

