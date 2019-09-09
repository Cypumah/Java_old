package ru.stqa.pft.sandbox;

/**
 * Created by Sunny on 09.09.2019.
 */
public class PointDistance {

  public static void main(String[] args) {

    Point p1 = new Point(8,9);
    Point p2 = new Point(0,0);

    System.out.println("Расстояние между точками с координатами " + "(" + p1.x + ", " + p1.y + ") " + "и " + "(" + p2.x + ", " + p2.y + ") " + " = " + Point.distance(p1,p2));

  }


}
