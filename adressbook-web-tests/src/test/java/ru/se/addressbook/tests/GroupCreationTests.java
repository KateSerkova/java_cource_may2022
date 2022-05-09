package ru.se.addressbook.tests;

import org.testng.annotations.Test;
import ru.se.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.goToGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("test11", "test22", "test33"));
    app.submitGroupCreation();
    app.returnToGroupPage();
  }

}
