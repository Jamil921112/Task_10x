package ex_21_Exception;

public class Lab_132_Custom_Exception {
    public static void main(String[] args) {
      Bank sbi = new Bank("INR",100);
      Bank icici = new Bank("INR",123);
      Bank JpChase = new Bank("USD",100);
   //   int result = sbi.add(icici);
        int result = sbi.add(JpChase);
        System.out.println(result);
    }
}
