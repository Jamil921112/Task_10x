package ex_21_Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab_130Interview {
    public static void main(String[] args)throws FileNotFoundException,Exception  {
        try {
            FileReader f = new FileReader(("C// abc.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
