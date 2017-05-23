package automation.stepdef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.pageobject.ContactConfirmationPage;
import com.cucumber.pageobject.ContactDetailPage;
import com.cucumber.pageobject.LandingPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUsStepDef {

//	WebDriver driver = new FirefoxDriver();

//	@Before
//	public void test(){
//		System.out.println("shailendra");
//		System.out.println("shailendra");
//		System.out.println("shailendra");
//		System.out.println("shailendra");
//		System.out.println("shailendra");
//		System.setProperty("webdriver.chrome.driver", "/Users/kartikeyaj/Desktop/SeleniumMavenPageObjectTest/chromedriver.exe");
//	}

	WebDriver driver = new ChromeDriver();
	LandingPage landingPage;
	ContactDetailPage contactdetialpage;
	ContactConfirmationPage contactconfirmationpage;

	@Given("^I am on the website page$")
	public void I_am_on_the_Website_page() throws Throwable {
		// driver.navigate().to("http://thetestroom.com/webapp");
		landingPage = new LandingPage(driver);
		landingPage.navigateToWebApp();
	}

	@When("^I click on \"([^\"]*)\"$")
	public void I_click_on(String link) throws Throwable {
		// driver.findElement(By.id(link.toLowerCase() + "_link")).click();
		contactdetialpage = landingPage.navigateToContactPage(link);
	}

	@And("^I enter \"([^\"]*)\" into name field$")
	public void I_enter_into_name_field(String value) throws Throwable {
		// driver.findElement(By.name("name_field")).sendKeys(value);
		contactdetialpage.setNameField(value);
	}

	@And("^I enter \"([^\"]*)\" into address field$")
	public void I_enter_into_address_field(String value) throws Throwable {
		// driver.findElement(By.name("address_field")).sendKeys(value);
		contactdetialpage.setAddressField(value);
	}

	@And("^I enter \"([^\"]*)\" into postal field$")
	public void I_enter_into_postal_field(String value) throws Throwable {
		// driver.findElement(By.name("postcode_field")).sendKeys(value);
		contactdetialpage.setPostalCodeField(value);
	}

	@And("^I enter \"([^\"]*)\" into Email field$")
	public void I_enter_into_Email_field(String value) throws Throwable {
		// driver.findElement(By.name("email_field")).sendKeys(value);
		contactdetialpage.setEmailField(value);
	}

	@And("^I submit the form$")
	public void I_submit_the_form() throws Throwable {
		// driver.findElement(By.id("submit_message")).click();
		contactconfirmationpage = contactdetialpage.submitForm();
	}

	@Then("^I check i am on conformation page$")
	public void I_check_i_am_on_conformation_page() throws Throwable {
		// Assert.assertTrue(driver.findElement(By.cssSelector(".content h1")).getText().contains("We have your message"));
		Assert.assertTrue(contactconfirmationpage.getPageTitle().contains("We have your message"));
	}

	@And("^I close the browser$")
	public void I_close_the_browser() throws Throwable {
		// driver.quit();
		contactconfirmationpage.closeDriver();
	}
}
