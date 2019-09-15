package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Sunny on 15.09.2019.
 */
public class SessionHelper extends HelperBase {

  public SessionHelper(ChromeDriver driver) {
    super(driver);
  }

  public void login(String username, String password) {
    type(By.name("user"),username);
    type(By.name("pass"), password);
    click(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password:'])[1]/following::input[2]"));
  }

}
