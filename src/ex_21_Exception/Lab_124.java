package ex_21_Exception;

public interface Lab_124 {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            int a =10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
          e.printStackTrace();// This means Full detail with line number

        }
        System.out.println("2");
    }
}
  // or you can track the problem by
