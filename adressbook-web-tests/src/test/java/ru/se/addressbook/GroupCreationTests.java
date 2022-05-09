package ru.se.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    goToGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test11", "test22", "test33"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
