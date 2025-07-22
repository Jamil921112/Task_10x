package ex_15_Arrays;

public class Lab66_Arrays {
    public static void main(String[] args) {


        int[] marks = {1, 2, 3, 4, 5, 6};
        // 2nd
        int[] marks2 = new int[5];//Fixed size
        System.out.println(marks2.length);
        // string
        String s1 = "pramod";
        System.out.println(s1.length());

        marks2[0]= 32;
        marks2[1] = 54;
        marks2[2] = 65;
        marks2[3] = 48;
        System.out.println(marks2[3]);
        System.out.println(marks2[10]);//.ArrayIndexOutOfBoundsException
    }
}