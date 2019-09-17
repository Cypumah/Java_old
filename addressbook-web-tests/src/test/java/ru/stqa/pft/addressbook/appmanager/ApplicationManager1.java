package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sunny on 16.09.2019.
 */
public class ApplicationManager1 {

  public static ChromeDriver driver;
  private NavigationHelper1 navigationHelper1;
  private ContactHelper contactHelper;
  private SessionHelper1 sessionHelper1;


  public void init() {
    System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("http://localhost/addressbook/");
    contactHelper = new ContactHelper(driver);
    navigationHelper1 = new NavigationHelper1(driver);
    sessionHelper1 = new SessionHelper1(driver);
    sessionHelper1.login("admin", "secret");
  }

  public void stop() {
    driver.quit();
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }

  public NavigationHelper1 getNavigationHelper1() {
    return navigationHelper1;
  }
}
