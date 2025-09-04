package ex_17_Super_Abstraction;

public class lab_103_privateJava {

}
  class XYZ{
    protected int gold =10;

  }
class  CAB extends XYZ{
    void dispaly(){
       System.out.println(super.gold);
    }

}