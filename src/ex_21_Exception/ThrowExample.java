package ex_21_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowExample {
  static void Validate_age(int age){
      if (age <18){
          try {
              throw new Exception("Ager can't be <18");
          } catch (Exception e) {
              throw new RuntimeException(e);
          }
      }
  }
 public static void main(String[]args)throws FileNotFoundException {
      Validate_age(17);
     FileInputStream f = new FileInputStream("C:/a.log");
 }
}
