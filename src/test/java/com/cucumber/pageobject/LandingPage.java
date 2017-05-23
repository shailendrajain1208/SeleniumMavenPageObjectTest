package com.cucumber.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage extends AbstractPage {

	public LandingPage(WebDriver driver) {
		super(driver);
	}
	
	public ContactDetailPage navigateToContactPage (String link) {
		driver.findElement(By.id(link.toLowerCase() + "_link")).click();
		return new ContactDetailPage(driver);
		
	}
}
