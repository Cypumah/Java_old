package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sunny on 17.09.2019.
 */
public class ContactHelper extends HelperBase{

  public ContactHelper(WebDriver driver) {
    super (driver);
  }

  public void submitContactCreaion() {
    click(By.xpath("//input[@name='submit']"));
  }

  public void fillContactForm(ContactData contactData, boolean creation) {
    type(By.name("firstname"), contactData.getName());
    type(By.name("middlename"), contactData.getMiddlename());
    type(By.name("lastname"),contactData.getLastname());
    type(By.name("nickname"), contactData.getNickname());
    type(By.name("company"), contactData.getCompany());
    type(By.name("address"), contactData.getAddress());
    type(By.name("home"), contactData.getHomephone());
    type(By.name("mobile"), contactData.getMobilephone());
    type(By.name("notes"), contactData.getNotes());

    if (creation) {
      new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
  }

  public void initContactCreation() {
    click(By.linkText("add new"));
  }

  public void deleteSelectedContact() {
    click(By.xpath("//input[@value='Delete']"));
    driver.switchTo().alert().accept();
  }

  public void selectContact(int index) {
    driver.findElements(By.name("selected[]")).get(index).click();
  }

  public void selectContactById(int id) {
    driver.findElement(By.cssSelector("input[value='" + id + "']")).click();
  }

  public void initContactModification(int id) {
    //click(By.xpath("//img[@alt='Edit']"));
    driver.findElement(By.cssSelector("a[href='" + "edit.php?id=" + id + "']")).click();
  }

  public void submitContactModification() {
    click(By.xpath("//input[@value='Update']"));
  }

  public void gotoContactPage() {
    if (isElementPresent(By.id("maintable"))) {
      return;
    }
    click(By.linkText("home page"));
  }

  public void createContact(ContactData contact, boolean creation) {
    initContactCreation();
    fillContactForm(contact, creation);
    submitContactCreaion();
    gotoContactPage();
  }

  public boolean isThereAContact() {
    return (isElementPresent(By.name("selected[]")));
  }

  public int contactCount() {
    return driver.findElements(By.name("selected[]")).size();
  }

  public List<ContactData> list() {
    List<ContactData> contacts = new ArrayList<ContactData>();
    List<WebElement> rows = driver.findElements(By.name("entry"));
    for (WebElement row : rows) {
      List<WebElement> cells = row.findElements(By.tagName("td"));
      Integer id = Integer.parseInt(cells.get(0).findElement(By.tagName("input")).getAttribute("value"));
      String name = cells.get(2).getText();
      String lastname = cells.get(1).getText();
      ContactData contact = new ContactData(id, name, null, lastname, null, null, null, null, null, null, null);
      contacts.add(contact);
    }
    return contacts;
  }
}
