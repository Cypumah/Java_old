package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by Sunny on 17.09.2019.
 */
public class ContactDeletionTests extends TestBase{

  @Test (enabled = false)
  public void testContactDeletion() throws Exception {
    app.goTo().gotoHomePage();
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("tre", "tre", "tre", "tre", "tre", "st Push, Krasnaya street 8", "64731584", "33342", "privet privet", "test7"), true);
    }
    int before = app.getContactHelper().contactCount();
    app.getContactHelper().selectContact(0);
    app.getContactHelper().deleteSelectedContact();
    app.goTo().gotoHomePage();
    int after = app.getContactHelper().contactCount();
    Assert.assertEquals(after, before - 1);

  }

}
