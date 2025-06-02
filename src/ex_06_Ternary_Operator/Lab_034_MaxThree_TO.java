package ex_06_Ternary_Operator;

public class Lab_034_MaxThree_TO {
    public static void main(String[] args) {
        //Find the largest number n1,n2,n3=> max(n1,n2,n3)
        // Find the inp & output
        // n1,n2,n3 -> data type -> int
        // o/p - int
        // 23,34,10 ->34
        //step 2   Rough logic
        // n1>
        int n1 = 23;
        int n2 = 34 ;
        int n3 = 10 ;
        int  maxnum = (n1>= n2)? ((n1 >= n3)? n1 : n3)  : ((n2>=n3)? n2 :n3) ;
        System.out.println( "maxnum number:" + maxnum);


    }
}
