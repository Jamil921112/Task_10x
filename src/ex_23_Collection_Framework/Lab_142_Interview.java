package ex_23_Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab_142_Interview {
    public static void main(String[] args) {

        List marks = new ArrayList();
        marks.add(56);
        marks.add(89);
        marks.add(96);
        marks.add(75);
        System.out.println(marks);
      Collections.sort(marks);
        System.out.println(marks);

      //  reverse Order♦
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);

    }
}
