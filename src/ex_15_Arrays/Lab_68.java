package ex_15_Arrays;

import java.util.Arrays;

public class Lab_68 {
    public static void main(String[] args) {
        int []marks ={55,68,26,48,57};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("------");
        for (int i =0 ; i< marks.length;i++) {

            System.out.println(marks[i]);
        }
        Arrays.sort(marks);
        
        }
}
