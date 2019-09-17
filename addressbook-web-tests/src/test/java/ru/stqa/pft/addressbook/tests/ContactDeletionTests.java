package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by Sunny on 17.09.2019.
 */
public class ContactDeletionTests extends TestBase{

  @Test

  public void testContactDeletion() throws Exception {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().selectContact ();
    app.getContactHelper().deleteSelectedContact();
    app.getNavigationHelper().gotoHomePage();
  }

}
