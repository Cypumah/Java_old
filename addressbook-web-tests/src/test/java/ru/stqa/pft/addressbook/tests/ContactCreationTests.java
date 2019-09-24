package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Set;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.goTo().gotoHomePage();
    Set<ContactData> before = app.contact().all();
    app.contact().initContactCreation();
    ContactData contact = new ContactData()
            .withName("!!!").withMiddlename("1212").withLastname("111").withNickname("tre").withCompany("tre").withAddress("st Push, Krasnaya street 8").withHomephone("64731584").withMobilephone("33342").withNotes("privet privet").withGroup("test7");
    app.contact().createContact(contact, true);
    Set<ContactData> after = app.contact().all();
    Assert.assertEquals(after.size(), before.size() + 1);


   // int max = after.stream().max((o1, o2) -> Integer.compare(o1.getId(), o2.getId())).get().getId();
   // contact.withId(max);
    contact.withId(after.stream().mapToInt((g)-> g.getId()).max().getAsInt());
    before.add(contact);
    Assert.assertEquals(before, after);

  }
}
