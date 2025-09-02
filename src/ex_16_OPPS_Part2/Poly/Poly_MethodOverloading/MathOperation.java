package ex_16_OPPS_Part2.Poly.Poly_MethodOverloading;

public class MathOperation {
    // Multiple Time it is loaded with same Operation
    // With Different Argument
          int add(int a , int b){
              return a+b;

          }
          int add ( int a , int b,int c){
              return a+b+c;
          }
            double add (double a, double b){
              return a+b;
            }

    }
