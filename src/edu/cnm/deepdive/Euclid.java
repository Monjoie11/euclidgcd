package edu.cnm.deepdive;

public class Euclid {


  public static int greatDenom(int a, int b){

    while (a != b){
      if ( a > b){
        a -= b;
      } else {
        b -= a;
      }
      return a;
    }
    return a;
  }

  public static void main(String[] args) {
    System.out.println(greatDenom(553237, 448043));
    System.out.println(greatDenom(448043, 553237));
    System.out.println(greatDenom(55323758, 448048583));
  }
}

