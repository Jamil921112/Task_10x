package ex_07Increment_Decr;

public class Lab_037_IncDcr {
    public static void main(String[] args) {
        // Take inputs


       String age_string = args[0];
       int age = Integer.parseInt(age_string);
        System.out.println(age);

        String canIGoGoa = (age>=25)? "yes" : "no ";
        System.out.println(canIGoGoa);
    }
}
