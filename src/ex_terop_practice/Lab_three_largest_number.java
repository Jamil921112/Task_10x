package ex_terop_practice;

public class Lab_three_largest_number {
    public static void main(String[] args) {
        // 100,52,35
     int n1=100, n2=52, n3=35;

     int largest = (n1>=n2)?((n1>=n3) ? n1 : n3 ) :((n2>=n3)? n2:n3);
        System.out.println( "largest number:"+largest);


    }


    
}
