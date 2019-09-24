package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;


import java.util.HashSet;
import java.util.List;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.goTo().gotoHomePage();
    List<ContactData> before = app.getContactHelper().list();
    app.getContactHelper().initContactCreation();
    ContactData contact = new ContactData()
            .withId(before.get(before.size() - 1).getId()).withName("!!!").withMiddlename("1212").withLastname("111").withNickname("tre").withCompany("tre").withAddress("st Push, Krasnaya street 8").withHomephone("64731584").withMobilephone("33342").withNotes("privet privet").withGroup("test7");
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
    contact.withId(max1);
    before.add(contact);
    Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));

  }
}
