package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Sunny on 21.09.2019.
 */
public class PrimeTests {



  @Test
  public void testPrime() {
    Assert.assertTrue(Primes.isPrimeWhile(Integer.MAX_VALUE));
  }

  @Test
  public void testNonPrime() {
    Assert.assertFalse(Primes.isPrimeWhile(Integer.MAX_VALUE-2));
  }

  @Test
  public void testPrime0() {
    Assert.assertTrue(Primes.isPrimeWhile(5));
  }
}
