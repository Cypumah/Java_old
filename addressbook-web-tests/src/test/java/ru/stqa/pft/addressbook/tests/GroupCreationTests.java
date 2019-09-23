package ru.stqa.pft.addressbook.tests;

//import org.testng.annotations.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

import java.security.acl.Group;
import java.util.List;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    app.getNavigationHelper().gotoGroupPage();
    List<GroupData> before = app.getGroupHelper().getGroupList();
    app.getGroupHelper().createGroup(new GroupData("test7", "jfur", "34"));
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size() + 1);
  }
}
