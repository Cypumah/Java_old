package ru.stqa.pft.addressbook.tests;

import org.hamcrest.MatcherAssert;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Set;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.equalToObject;
import static org.hamcrest.MatcherAssert.*;

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
    assertThat(after.size(), equalToObject(before.size() + 1));

    contact.withId(after.stream().mapToInt((g)-> g.getId()).max().getAsInt());
    before.add(contact);
    assertThat(after, equalTo(before));

  }
}
