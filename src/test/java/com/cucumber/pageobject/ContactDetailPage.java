package com.cucumber.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactDetailPage extends AbstractPage {

	public ContactDetailPage(WebDriver driver) {
		super(driver);
	}

	public ContactDetailPage setNameField(String value) {
		driver.findElement(By.name("name_field")).sendKeys(value);
		return  new ContactDetailPage (driver);
	}

	public ContactDetailPage setAddressField(String value) {
		driver.findElement(By.name("address_field")).sendKeys(value);
		return  new ContactDetailPage (driver);
	}
	
	public ContactDetailPage setPostalCodeField(String value) {
		driver.findElement(By.name("postcode_field")).sendKeys(value);
		return  new ContactDetailPage (driver);
	}

	public ContactDetailPage setEmailField(String value) {
		driver.findElement(By.name("email_field")).sendKeys(value);
		return  new ContactDetailPage (driver);
	}
	
	public ContactConfirmationPage submitForm() {
		driver.findElement(By.id("submit_message")).click();
		return  new ContactConfirmationPage (driver);
	}

}
