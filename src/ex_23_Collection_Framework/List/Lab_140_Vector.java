package ex_23_Collection_Framework.List;

import java.util.*;

public class Lab_140_Vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("arshad");
        v.add("jamil");
        v.size();
        v.contains("dutta");
        v.remove("jamil");
        v.add("jamil");
      //  v.add(123);
        System.out.println(v.size());

        System.out.println(v);
        // Vector and arrayList are similaronly thing is vector is
        // thread safe and synchronized
        System.out.println("------");
        Iterator iterator = v.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-------");
        // Extra Enumeration
        Enumeration<String> enumeration = v.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }

    public static class Lab_Nested_Arraylist {
        public static void main(String[] args) {
          // List l = new ArrayList();
        //   l.add("arshad");
      //     l.add("jamil");
      //     l.add(123);

            List<String> fruits = new ArrayList();
            fruits.add("ORANGE");
            fruits.add("nuts");
            fruits.add("apple");
          //  fruits.add(123);
            System.out.println(fruits);


            List Vegitables =new ArrayList();
            Vegitables.add("tomato");
            Vegitables.add("potato");
            Vegitables.add("onion");
            System.out.println(Vegitables);

            List all_Item = new ArrayList();
            all_Item.add(fruits);
            all_Item.add(Vegitables);
            System.out.println(all_Item);

            System.out.println(all_Item.get(1));


        }

    }
}
