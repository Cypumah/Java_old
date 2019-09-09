package ru.stqa.pft.sandbox;

/**
 * Created by Sunny on 09.09.2019.
 */
public class PointDistance {

  public static void main(String[] args) {

    Point p = new Point(8,9,0,0);

    System.out.println("Расстояние между точками с координатами " + "(" + p.x + ", " + p.y + ") " + "и " + "(" + p.x1 + ", " + p.y1 + ") " + " = " + p.distance());

  }


}
