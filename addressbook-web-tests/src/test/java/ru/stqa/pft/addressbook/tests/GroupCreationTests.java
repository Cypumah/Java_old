package ru.stqa.pft.addressbook.tests;

//import org.testng.annotations.*;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    //public void testGroupCreation() throws Exception {
    app.gotoGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("test4", "4", "42"));
    app.submitGroupCreation();
    app.returnToGroupPage();
  }


}
