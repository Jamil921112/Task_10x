package ex_16_OPPS_Part2.Access_Modifier.Police;

public class Cop {
    public  int gun;
    String iCard;

    public Cop(int gun) {
        this.gun = gun;
    }
     protected void    CanIshoot(){
        System.out.println(" Yes you can shoot");

}
}
