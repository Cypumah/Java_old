package ru.stqa.pft.sandbox;

/**
 * Created by Sunny on 07.09.2019.
 */
public class Rectangle {
  public double a;
  public double b;

  public Rectangle(double a, double b) {
    this.a = a;
    this.b = b;
      }

  public double area() {
    return this.a*this.b;
  }

}
