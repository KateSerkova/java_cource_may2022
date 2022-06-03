package ru.se.addressbook.tests;

import org.testng.annotations.Test;
import ru.se.addressbook.model.ContactData;

public class AddingContactTests extends TestBase {

  @Test
  public void testAddingContact() throws Exception {
    app.goToCreateAccountPage();
    app.getContactHelper().fillCreateContactForm(new ContactData("Sonya", "Se", "Raduzhna", "Zaa", "Microsoft", "Voronezh, Pobedy bulvar, 90", "892082346666", "emailtest@gmail.com"));
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToHomePage();
  }
}
