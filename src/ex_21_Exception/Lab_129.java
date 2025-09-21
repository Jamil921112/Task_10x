package ex_21_Exception;

public class Lab_129 {
    public static void main(String[] args) {
        String ip = null;// ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        try {
            String t = args[0];
            int a = Integer.parseInt(t); //NumberFormatException: For input string: "pramod"
            int b = 100 / a; //ArithmeticException
            System.out.println(b);
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}