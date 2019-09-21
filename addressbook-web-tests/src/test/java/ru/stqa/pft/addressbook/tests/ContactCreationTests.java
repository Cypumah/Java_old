package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("SDS", "en", "Ivanov1", "Iva", "Trim", "st Push, Krasnaya street 8", "64731584", "33342", "privet privet", "test7"), true);
    app.getContactHelper().submitContactCreaion();
    app.getNavigationHelper().gotoContactPage();
  }

}
