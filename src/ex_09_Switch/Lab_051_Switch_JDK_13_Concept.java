package ex_09_Switch;

public class Lab_051_Switch_JDK_13_Concept {
    public static void main(String[] args) {
        // JDK >13
        //multiple match
        int itemcode = 002;
        switch (itemcode) {
            case 001, 002, 004:


                System.out.println("Item is Elecronic");
                break;

            case 007, 003,005:

                System.out.println("This is mechanical Appliances");
                break;
            default:
                System.out.println("None");

        }
        }
}

