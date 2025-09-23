package ex_23_Collection_Framework;

import java.util.Vector;

public class Lab_140_Vector {
    public static void main(String[] args) {
        Vector v = new Vector();
          v.add("arshad");
          v.add("jamil");
          v.size();
          v.contains("dutta");
          v.remove("jamil");
          v.add("jamil");
          v.add(123);
        System.out.println(v.size());

        System.out.println(v);
       // Vector and arrayList are similaronly thing is vector is
        // thread safe and synchronized

    }
}
