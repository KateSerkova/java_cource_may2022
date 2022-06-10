package ru.se.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

  @Test
  public void deleteContactTest(){
    app.getContactHelper().chooseContact();
    app.getContactHelper().deleteSelectedContact();
  }

}
