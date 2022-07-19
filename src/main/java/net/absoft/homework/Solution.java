package net.absoft.homework;

public class Solution {

  private final double x1;
  private final double x2;

  public Solution(double x1, double x2) {

    this.x1 = x1;
    this.x2 = x2;

  }

  public double getX1() {
    return this.x1;
  }
  public double getX2() {
    return this.x2;
  }

  public static Solution getSolution(int a, int b, int c) {
    double D = b*b - 4*a*c;

    if (D < 0) {
      return null;
    } else {
      double x1 = ( -b + Math.sqrt(D) ) / ( 2*a );
      double x2 = ( -b - Math.sqrt(D) ) / ( 2*a );
      return new Solution(x1, x2);
    }
  }
}
