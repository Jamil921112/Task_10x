package ex_21_Exception;

public class Lab_121 {
    public static void main(String[] args) {
        System.out.println("Start of the program");

        String ip =args[0];// ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        int a = Integer.parseInt(ip); //NumberFormatException: For input string: "pramod"
        int b= 100/a;
        System.out.println(b);//ArithmeticException: / by zero when argument is zero



        }
    }
  // Exception
  //ArithmeticException: / by zero when argument is zero
//NumberFormatException: For input string: "pramod"
// ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
//