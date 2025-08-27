package multilevel_inheritance;

public class Lab_92_Multilevel {
    public static void main(String[] args) {
        Son pramod  = new Son();
        Father F1 = new Father();
        Grandfather gf = new Grandfather();


        pramod.home();

        Father f2 = new Son();
        Grandfather g1 = new Son();
        Grandfather G2 = new Father();

    }

}

