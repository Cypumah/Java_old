package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Sunny on 15.09.2019.
 */
public class NavigationHelper extends HelperBase {

  public NavigationHelper(ChromeDriver driver) {
    super(driver);
  }

  public void gotoGroupPage() {
    click(By.linkText("groups"));
  }
}
