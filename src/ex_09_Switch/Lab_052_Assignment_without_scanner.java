package ex_09_Switch;

public class Lab_052_Assignment_without_scanner {
    public static void main(String[] args) {
        // CLI User Input Name ,Age,Salary
        String name =args[0];
        int age = Integer.parseInt(args[1]);
        double salary = Double.parseDouble(args[2]);
        // print the collected information
        System.out.println("--- User Information ---");
        System.out.println("Name:" + name);
        System.out.println("age:" +age);
        System.out.println("salary:" + salary);
   // new switch
      //  case 001 -> System.out.println("001");
        // case 002 -> System.out.println("005");
     // -> means break
    }
}
