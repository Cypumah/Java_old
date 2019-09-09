package ru.stqa.pft.sandbox;

/**
 * Created by Sunny on 09.09.2019.
 */
public class Point {

  public double x;
  public double y;
  public double x1;
  public double y1;


  public Point (double x, double y, double x1, double y1) {
    this.x = x;
    this.y = y;
    this.x1 = x1;
    this.y1 = y1;
  }

  public double distance() {

    return Math.sqrt(Math.pow((x-x1),2)+Math.pow((y-y1),2));

  }

}
