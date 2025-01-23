package TASK_ALL;

public class Lab_User_input {
    public static void main(String[] args) {
        String age_string = args[0];
        int age = Integer.parseInt(age_string);
        System.out.println(age);

        String salary_string = args[1];
        int salary = Integer.parseInt(salary_string);
        System.out.println(salary);

        String Name = args[2];
        System.out.println(Name);
       
    }

    public static class ex_ternaryoperator {
        public static void main(String[] args) {
            int x = 10;
            int y = 20;//Finding maximum number between two x and y  using ternary operator
            int max = x > y ? x : y;
            System.out.println(max);


        }
    }
}
