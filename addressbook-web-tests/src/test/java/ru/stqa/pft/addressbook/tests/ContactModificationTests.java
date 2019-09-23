package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by Sunny on 17.09.2019.
 */
public class ContactModificationTests extends TestBase {


  @Test
  public void testContactModification () {
    app.getNavigationHelper().gotoHomePage();
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("tre", "tre", "tre", "tre", "tre", "st Push, Krasnaya street 8", "64731584", "33342", "privet privet", "test7"), true);
    }
    int before = app.getContactHelper().contactCount();
    app.getContactHelper().selectContact(0);
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Ivan", "Ivanov", "Ivanov1", "Iva", "Trim", "st Push, Krasnaya street 8", "64731584", "33342", "privet privet", null), false);
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().gotoHomePage();
    int after = app.getContactHelper().contactCount();
    Assert.assertEquals(after, before);

  }

}
