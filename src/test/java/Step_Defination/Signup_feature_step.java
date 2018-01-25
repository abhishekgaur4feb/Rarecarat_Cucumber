package Step_Defination;

import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Page_Object.Filter_By_Diamond_page_Cucumber;
import Page_Object.Login_page_object;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Signup_feature_step {
	static final Logger logger = Logger.getLogger(Login_feature_step.class);
	public WebDriver driver;
	
	@Given("^Open browser for Signup$")
	public void open_browser_for_Signup() throws Throwable {
		driver = Hooks.driver;
		BasicConfigurator.configure();
		logger.info("Fetching URL and Opening the Url");		
		}
	

	@When("^NewRarecaratUser enters \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
	public void newrarecaratuser_enters_and_and_and(String fname, String lname, String email_signup, String signup_password) throws InterruptedException {
		BasicConfigurator.configure();
		PageFactory.initElements(driver, Login_page_object.class);
		logger.info("Clicking on the Child Window");
		Login_page_object.gobutton.click();
		

		//String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
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
		logger.info("Signup by RareCarat Clicked Successfully");
		
		Login_page_object.NewUser.click();
		logger.info("Signup for New User Clicked Successfully");
		Thread.sleep(1000);
		Login_page_object.FirstName.sendKeys(fname);
		Thread.sleep(1000);
		Login_page_object.LastName.sendKeys(lname);
		
		Thread.sleep(1000);
		Login_page_object.MailID.sendKeys(email_signup);
		
		Thread.sleep(2000);
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", Login_page_object.Signup_Password);
		Login_page_object.Signup_Password.sendKeys(signup_password);
		
		logger.info("All Entries given");
		
		Thread.sleep(1000);
		Login_page_object.Sign_up_button.click();
		logger.info("Finally clicked Signup");
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//WebElement element = wait
				//.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='required-filled ng-binding'][2]")));
		//element.click();
				
		String classNameValueText=Login_page_object.Message_already_registered.getText();
		System.out.println("Value of classNameValue attribute: "+classNameValueText);
		
		String classNameValueText1=Login_page_object.Message_success.getText();
		System.out.println("Value of classNameValue attribute: "+classNameValueText1);
		Thread.sleep(3000);	
		 Assert.assertEquals("Your user has been created. Please check your email to activate your account.", classNameValueText1);
	}

	@Then("^Message displayed Signup Successful$")
	public void message_displayed_Signup_Successful() throws Throwable {
	    
	}

}
