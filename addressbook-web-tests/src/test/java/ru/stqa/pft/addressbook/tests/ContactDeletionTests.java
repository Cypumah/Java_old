package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

/**
 * Created by Sunny on 17.09.2019.
 */
public class ContactDeletionTests extends TestBase {

  @BeforeMethod
  public void ensurePreconditions() {
    app.goTo().gotoHomePage();
    if (!app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("tre", "tre", "tre", "tre", "tre", "st Push, Krasnaya street 8", "64731584", "33342", "privet privet", "test7"), true);
    }
  }

  @Test
  public void testContactDeletion() throws Exception {
    //int before = app.getContactHelper().contactCount();
    List<ContactData> before = app.getContactHelper().list();
    app.getContactHelper().selectContact(0);
    app.getContactHelper().deleteSelectedContact();
    app.goTo().gotoHomePage();
    //int after = app.getContactHelper().contactCount();
    List<ContactData> after = app.getContactHelper().list();

    Assert.assertEquals(after.size(), before.size() - 6);

  }
}

