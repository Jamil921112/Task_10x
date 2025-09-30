package ex_23_Collection_Framework.List;
import  java.util.List;
import java.util.ArrayList;

public class Lab_138_ArrayList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);// 0
        list.add(2);//1
        list.add(3);//2
        list.add(4);//3
        list.add("4");
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(1));
        System.out.println(list.contains("1"));
        System.out.println(list.indexOf(3));
        System.out.println(list.lastIndexOf(3));

        System.out.println(list);

        System.out.println("-------");
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}