package com.cucumber.pageobject;

import org.openqa.selenium.WebDriver;

public class AbstractPage {
	
	protected WebDriver driver;
	
	public AbstractPage(WebDriver driver){
		this.driver = driver;
		}
		
	public LandingPage navigateToWebApp(){
		System.out.println("**********************");
		System.out.println(driver);
		driver.navigate().to("http://thetestroom.com/webapp");
		return new LandingPage(driver);
	} 
	
	public void closeDriver () {
		driver.quit();
	}
}
