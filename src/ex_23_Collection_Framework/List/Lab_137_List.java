package ex_23_Collection_Framework.List;

  import java.util.ArrayList;
  import  java.util.List;
public class Lab_137_List {
    public static void main(String[] args) {
        List fruits = List.of("Orange","apple","banana", "mango");

        //of is a static method can be fully implemented in interface
        // Default method - can fully Implimented  in interface
       // fruits.add("cherry");//java.lang.UnsupportedOperationException
      //  fruits.remove("apple");// not possible

        ArrayList arrayList = new ArrayList();
        arrayList.add("arshad");
        arrayList.add(null);
        arrayList.add("jamil");
        arrayList.add("jamil");// duplicate allowed
        arrayList.add(123);// different data types is allowed
        System.out.println(arrayList);
        System.out.println(arrayList.size());
// order is always maintained
        List l = new ArrayList(); // child to parent
        l.add(123);
        l.add(564);
        System.out.println(l);

    }
}
