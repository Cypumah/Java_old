package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager1;

/**
 * Created by Sunny on 16.09.2019.
 */
public class TestBase1 {

  protected final ApplicationManager1 app = new ApplicationManager1();

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }

  @AfterMethod
  public void tearDown() {
    app.stop();
  }
}
