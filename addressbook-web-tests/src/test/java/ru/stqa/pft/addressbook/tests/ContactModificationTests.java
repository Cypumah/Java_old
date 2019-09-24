package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.HashSet;
import java.util.List;

/**
 * Created by Sunny on 17.09.2019.
 */
public class ContactModificationTests extends TestBase {

  @BeforeMethod
  public void ensurePreconditions() {
    app.goTo().gotoHomePage();
    if (!app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("tre", "tre", "tre", "tre", "tre", "st Push, Krasnaya street 8", "64731584", "33342", "privet privet", "test7"), true);
    }
  }

  @Test
  public void testContactModification() {
    List<ContactData> before = app.getContactHelper().list();
    ContactData contact = new ContactData(before.get(before.size() - 1).getId(), "ttt", "ttt", "jjjjjj", "Iva", "Trim", "st Push, Krasnaya street 8", "64731584", "33342", "privet privet", null);
    app.getContactHelper().initContactModification(contact.getId());
    app.getContactHelper().fillContactForm(contact, false);
    app.getContactHelper().submitContactModification();
    app.goTo().gotoHomePage();
    List<ContactData> after = app.getContactHelper().list();
    Assert.assertEquals(after.size(), before.size());

    before.remove(before.size() - 1);
    before.add(contact);
    Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));


  }

}
