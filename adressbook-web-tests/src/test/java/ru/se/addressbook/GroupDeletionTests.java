package ru.se.addressbook;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testDeleteGroups() throws Exception {
    goToGroupPage();
    selectGroup();
    deleteSelectedGroups();
    returnToGroupPage();
  }
}
