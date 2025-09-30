package ex_23_Collection_Framework.List;

import java.util.List;
import java.util.Vector;

public class Lab_149_ArrayList_Class_Element {
    public static void main(String[] args) {

      Student s1 = new Student("Amit","1");
      Student s2 = new Student("babu","2");
      Student s3 = new Student("neena","3");

      List<Student> myStudents = new Vector<>();// We can use stack,
                                                //Arraylist, LinkdedList,Vector
      myStudents.add(s1);
      myStudents.add(s2);

      myStudents.add(s3);
        System.out.println(myStudents);




    }

}








