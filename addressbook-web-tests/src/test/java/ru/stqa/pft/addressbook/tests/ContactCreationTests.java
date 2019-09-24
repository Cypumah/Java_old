package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;


import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.goTo().gotoHomePage();
    List<ContactData> before = app.getContactHelper().list();
    app.getContactHelper().initContactCreation();
    ContactData contact = new ContactData(before.get(before.size() - 1).getId(), "!!!", "1212", "111", "tre", "tre", "st Push, Krasnaya street 8", "64731584", "33342", "privet privet", "test7");
    app.getContactHelper().createContact(contact, true);
    List<ContactData> after = app.getContactHelper().list();
    Assert.assertEquals(after.size(), before.size() + 1);



    int max = 0;
    for (ContactData g : after) {
      if (g.getId() > max) {
        max = g.getId();
      }
    }



    int max1 = after.stream().max((o1, o2) -> Integer.compare(o1.getId(), o2.getId())).get().getId();
    contact.setId(max1);
    before.add(contact);
    Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));

  }
}
