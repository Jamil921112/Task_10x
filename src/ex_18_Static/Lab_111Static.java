package ex_18_Static;

public class Lab_111Static {
    public static void main(String[] args) {
    Student s1 =new Student(23);
    Student s2 = new Student(24);

        System.out.println(s1.age);
        System.out.println(s2.age);

       // System.out.println(Student.course_Name);
        Student.m1();
    }
}
   class Student{
    int age ;
    static String course_Name = "ATB";  // Class Loader Level

    public Student (int age_c){
        this.age= age_c;

    }
    static void m1(){
           System.out.println("I am Stating Method ");
       }
}