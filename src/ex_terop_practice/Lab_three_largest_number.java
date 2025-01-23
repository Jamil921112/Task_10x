package ex_terop_practice;

public class Lab_three_largest_number {
    public static void main(String[] args) {
        // 100,52,35
     int a=100, b=52, c=35;
     int largest = (a>=b)?((a>=c) ? a: c ) :((b>=c)? b:c);
        System.out.println( "largest number:"+largest);


    }


    
}
