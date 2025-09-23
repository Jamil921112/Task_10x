package ex_22_Generics;

public class Lab_135 {
    public static void main(String[] args) {
       temp(25,26);
       temp("arshad","jamil");
       temp(true,false);
    }
    // T can be any data type
   public static <T>  T temp( T a,T b){ // T -> Generics
        System.out.println(a);
        System.out.println(b);
        return null;

    }

}
