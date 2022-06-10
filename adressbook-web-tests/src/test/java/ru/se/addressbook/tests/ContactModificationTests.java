package ru.se.addressbook.tests;

import org.testng.annotations.Test;
import ru.se.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase{

  @Test
  public void modificationContact(){
    app.getContactHelper().chooseContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillCreateContactForm(new ContactData("Sonya1", "Se", "Raduzhna", "Zaa", "Microsoft", "Voronezh, Pobedy bulvar, 90", "892082346666", "emailtest@gmail.com"));
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToHomePage();
  }
}
