package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Sunny on 17.09.2019.
 */
public class NavigationHelper1 extends HelperBase{

  public NavigationHelper1(ChromeDriver driver) {
    super (driver);
  }

  public void goToContactPage() {
    click(By.linkText("home page"));
  }
}
