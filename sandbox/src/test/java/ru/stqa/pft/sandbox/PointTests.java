package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Sunny on 16.09.2019.
 */
public class PointTests {

  @Test
  public void testDistance0 () {
    Point p1 = new Point(0,2);
    Point p2 = new Point(0,0);

    Assert.assertEquals(Point.distance(p1,p2), 2.0);

  }

  @Test
  public void testDistance1 () {
    Point p1 = new Point(-9,2);
    Point p2 = new Point(0,0);

    Assert.assertEquals(Point.distance(p1,p2), 2.0);

  }
  
  @Test
  public void testDistance2 () {
    Point p1 = new Point(6,2);
    Point p2 = new Point(3,79);

    Assert.assertEquals(Point.distance(p1,p2), 2.0);

  }

}
