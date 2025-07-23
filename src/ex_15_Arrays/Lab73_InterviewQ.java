package ex_15_Arrays;

import java.util.Arrays;

public class Lab73_InterviewQ {
    public static void main(String[] args) {
        int [] Numbers ={54,32,42,10};
        Arrays.sort(Numbers); // 10,32,42,54
        System.out.println(Numbers[Numbers.length-2]);
    }
}
