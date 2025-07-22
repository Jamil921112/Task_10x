package ex_13_Function;

public class Lab_064_User_defined_one {
    public static void main(String[] args) {
       // **User Defined Functions.**
       // 1. Without Parameters and Without Return Type.
      //  2. Without Parameters but With Return Type
      //  3. With Parameters and Without Return Type
      //  4. With Parameters and With Return Type

        // 1. Without Parameters and Without Return Type.
      //   greet();

         //   //  2. Without Parameters but With Return Type
         String s = with_me();
        System.out.println(s);
        int age_to_vote_person = age_to_vote();
        System.out.println("Age to vote is ->"+ age_to_vote_person);
        //  3. With Parameters and Without Return Type(90%)
        //greet_with_name("rashid");
    //    greet_with_name("ashiya");
     //   greet_with_fullname("arshad ","jamil");
   //     greet_with_fullname("masood ", "alam");
    //    greet_with_details("arshad", 25, 100);
     //   greet_with_details("zaid",27,2500);
        int result_sum = sum(3,4);
        System.out.println(result_sum);
        int result_sub =sub(5 ,4);
        System.out.println(result_sub);
    }
    static  void greet(){
        System.out.println("hi , i am without parameters and eithout return type");

    }
    //  2. Without Parameters but With Return Type
    static String with_me(){
      return"hi , how are you feeling with me";
    }
    static int age_to_vote(){
        System.out.println("Calculating age.." );
       return 18;
    }
    //  3. With Parameters and Without Return Type
      static void greet_with_name(String name){
          System.out.println("hi,Your name is " +name);
    }
    static  void greet_with_fullname(String firstname,String lastname){
        System.out.println("Hi , Your Name is " + firstname+ lastname);
    }
    static  void greet_with_details( String name,int age , double salary){
        System.out.println("Your name ->"+ name + "\nYour age is " + age + "\nYour salary is " + salary);
    }
    // 4.With Parameters and With Return Type
         static  int sum( int a, int b){
        return a+b ;
         }
         static int sub(int a, int b){
        return a-b;
         }
}