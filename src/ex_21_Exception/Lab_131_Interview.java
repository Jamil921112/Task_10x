package ex_21_Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab_131_Interview {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader(("C// abc.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("yes execute");
        }

    }
}
