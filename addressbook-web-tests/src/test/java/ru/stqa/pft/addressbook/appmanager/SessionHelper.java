package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Sunny on 15.09.2019.
 */
public class SessionHelper {

  private static ChromeDriver driver;

  public SessionHelper(ChromeDriver driver) {
    this.driver = driver;
  }

  public void login(String username, String password) {
    driver.findElement(By.name("user")).click();
    driver.findElement(By.name("user")).clear();
    driver.findElement(By.name("user")).sendKeys(username);
    driver.findElement(By.name("pass")).clear();
    driver.findElement(By.name("pass")).sendKeys(password);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password:'])[1]/following::input[2]")).click();
//    driver.findElement(By.xpath("(//[form[@id='LoginForm']/input[3]")).click();
  }

}
