package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Sunny on 17.09.2019.
 */
public class ContactModificationTests extends TestBase {

  @BeforeMethod
  public void ensurePreconditions() {
    app.goTo().gotoHomePage();
    if (!app.contact().isThereAContact()) {
      app.contact().createContact(new ContactData()
              .withName("!!!").withMiddlename("1212").withLastname("111").withNickname("tre").withCompany("tre").withAddress("st Push, Krasnaya street 8").withHomephone("64731584").withMobilephone("33342").withNotes("privet privet").withGroup("test7"), true);
    }
  }

  @Test
  public void testContactModification() {
    Set<ContactData> before = app.contact().all();
    ContactData modifiedContact = before.iterator().next();
    ContactData contact = new ContactData().withId(modifiedContact.getId()).withName("!!!").withMiddlename("1212").withLastname("111").withNickname("tre").withCompany("tre").withAddress("st Push, Krasnaya street 8").withHomephone("64731584").withMobilephone("33342").withNotes("privet privet").withGroup(null);
    app.contact().initContactModification(contact.getId());
    app.contact().fillContactForm(contact, false);
    app.contact().submitContactModification();
    app.goTo().gotoHomePage();
    Set<ContactData> after = app.contact().all();
    Assert.assertEquals(after.size(), before.size());

    before.remove(modifiedContact);
    before.add(contact);
    Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));





  }

}
