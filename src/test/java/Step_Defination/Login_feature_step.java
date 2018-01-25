package Step_Defination;

import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Page_Object.Login_page_object;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_feature_step {
	static final Logger logger = Logger.getLogger(Login_feature_step.class);
	public WebDriver driver;

	@Given("^Open browser$")
	public void Open_firefox_and_start_application() throws Throwable {
		driver = Hooks.driver;
		BasicConfigurator.configure();
		logger.info("Fetching URL and Opening the Url");
		//driver.get("http://www.rarecarat.com");
		}
	
	@When("^NewUser enters \"(.*?)\" and \"(.*?)\"$")
	public void user_enters_and(String uname, String password) throws InterruptedException {
		BasicConfigurator.configure();
		PageFactory.initElements(driver, Login_page_object.class);
		logger.info("Clicking on the Child Window");
		System.out.println("Username"+uname);
		System.out.println("Password"+password);
		Login_page_object.gobutton.click();

		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
		String subWindowHandler = null;
		
		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // switch to popup window
		System.out.println(driver.getTitle());
		// Now you are in the popup window, perform necessary actions here
		Login_page_object.RareCarat.click();
		Login_page_object.Login_Username.sendKeys(uname);
		Login_page_object.Login_Password.sendKeys(password);
		Login_page_object.Login.click();
		Thread.sleep(5000);
		logger.info("Clicked on login Provide username ans password");	
		
	    
	}

	@Then("^Message displayed Login Successful$")
	public void message_displayed_Login_Successful() throws Throwable {
		logger.info("User logged in Successfully");	    
	}
	


}
