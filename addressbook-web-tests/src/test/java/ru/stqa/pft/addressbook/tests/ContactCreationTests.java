package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;


import java.util.List;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.goTo().gotoHomePage();
    List<ContactData> before = app.getContactHelper().list();
    app.getContactHelper().initContactCreation();
    app.getContactHelper().createContact(new ContactData("!!!", "1212", "111", "tre", "tre", "st Push, Krasnaya street 8", "64731584", "33342", "privet privet", "test7"), true);
    List<ContactData> after = app.getContactHelper().list();
    Assert.assertEquals(after.size(), before.size() + 1);



  }
}
