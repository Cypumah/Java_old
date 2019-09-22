package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getNavigationHelper().gotoHomePage();
   // int before = app.getContactHelper().contactCount();
    app.getContactHelper().initContactCreation();
    app.getContactHelper().createContact(new ContactData("1111", "1212", "111", "tre", "tre", "st Push, Krasnaya street 8", "64731584", "33342", "privet privet", "test7"), true);
  //  int after = app.getContactHelper().contactCount();
  //  Assert.assertEquals(after, before + 1);
  }
}
