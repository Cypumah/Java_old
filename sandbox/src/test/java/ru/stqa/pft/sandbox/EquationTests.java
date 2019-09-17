package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Sunny on 17.09.2019.
 */
public class EquationTests {

  @Test
  public void test0() {
    Equation e = new Equation(1,3,1);
    Assert.assertEquals(e.rootNumber(), 2);
  }

  @Test
  public void test1() {
    Equation e = new Equation(1,2,1);
    Assert.assertEquals(e.rootNumber(), 1);
  }

  @Test
  public void test2() {
    Equation e = new Equation(90,3,1);
    Assert.assertEquals(e.rootNumber(), 0);
  }

  @Test
  public void testLinear() {
    Equation e = new Equation(0,3,1);
    Assert.assertEquals(e.rootNumber(), 1);
  }

  @Test
  public void testConstant() {
    Equation e = new Equation(0,0,1);
    Assert.assertEquals(e.rootNumber(), 0);
  }

  @Test
  public void testInfinity() {
    Equation e = new Equation(0,0,0);
    Assert.assertEquals(e.rootNumber(), -1);
  }

}
