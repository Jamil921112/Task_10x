package ex_17_Super_Abstraction;

public class Lab_109_Interview_Q {
}


interface I11{
}
 interface I12{}
class A1{}
class B2{}
class Test1 extends A1{}
 // class Test2 extends A1,B2{}//Multiple inhertance is not allowed
  class Test3 implements I11{}
  class  Test4 implements I11,I12{}
class  Test5 extends  A1 implements I11,I12{}
// class Test6 implements I12 extends A{}
  interface I3{}
   //  interface I3 extends A1{}









