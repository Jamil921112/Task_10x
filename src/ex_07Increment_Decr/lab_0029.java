package ex_07Increment_Decr;

public class lab_0029 {
    public static void main(String[] args) {
        int a = 10;
        int b = a++;
        System.out.println(a);
        System.out.println(b);
    }
}
//Step-by-step breakdown:

  /*/int a = 10;
You put the number 10 in the box called a

int b = a++;

a++ is post-increment &rarr; it means use the value first, then increase it.

So b gets the current value of  A which is 10.

        After assigning, a becomes 11.

        System.out.println(a);
Prints 11 (because a was increased after a++).

        System.out.println(b);
  /Prints 10 because b got the old value before

   */