package ex_14_String_Function;

public class Lab_065_StringBuilder_StringBuffer {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("pramod");
        stringBuffer.append("Dutta");
        System.out.println(stringBuffer);
    //    stringBuffer.reverse();
    //    System.out.println(stringBuffer);
        stringBuffer.append("World");
        System.out.println(stringBuffer);

        StringBuilder stringBuilder= new StringBuilder("Pramod");
        stringBuilder.append("Dutta");
        System.out.println(stringBuilder);
        stringBuilder .append("World!");
        System.out.println(stringBuffer.toString());

    }

}
