package Step_Defination;

import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Page_Object.Appointment_Deletion;
import Page_Object.Login_page_object;
import Page_Object.My_Stuff_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Appointment_Deletion_Step {
	static final Logger logger = Logger.getLogger(Login_feature_step.class);
	public WebDriver driver;

	
	
	
	@Given("^Open browser for Appointment Deletion$")
	public void Open_firefox_and_start_application() throws Throwable {
		driver = Hooks.driver;
		BasicConfigurator.configure();
		logger.info("Fetching URL and Opening the Url");
		//driver.get("http://www.rarecarat.com");
	}

	@When("^Existing User enters for Appointment Deletion \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
	public void existing_User_enters_for_My_Stuff_and(String uname, String password,int appointment_cancel_number) throws Throwable {
		BasicConfigurator.configure();
		//Initialization
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

		logger.info("Clicked on login Provide username and password");
	
	PageFactory.initElements(driver, My_Stuff_Page.class);
	Thread.sleep(4000);
	My_Stuff_Page.My_stuff_button.click();
	
	PageFactory.initElements(driver, Appointment_Deletion.class);
	
	
	
	
	if(appointment_cancel_number==1){
	
	WebDriverWait wait = new WebDriverWait(driver, 15);
	WebElement appointment_delete = wait
			.until(ExpectedConditions.elementToBeClickable(Appointment_Deletion.Delete_First_Appointment));
	
	/*Delete Appointment*/
	appointment_delete.click();
	
	
	
	String winHandleBefore = driver.getWindowHandle();

	// Perform the click operation that opens new window

	// Switch to new window opened
	for(String winHandle : driver.getWindowHandles()){
	    driver.switchTo().window(winHandle);
	}

	WebDriverWait wait1 = new WebDriverWait(driver, 15);
	WebElement appointment_delete_confirm = wait
			.until(ExpectedConditions.elementToBeClickable(Appointment_Deletion.Delete_Appointment_Confirm));
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", appointment_delete_confirm);
	appointment_delete_confirm.click();
	
	Thread.sleep(2000);

	// Close the new window, if that window no more required
	driver.close();

	// Switch back to original browser (first window)
	driver.switchTo().window(winHandleBefore);
	}
	
	
	if(appointment_cancel_number==2){
		
	WebDriverWait wait = new WebDriverWait(driver, 15);
	WebElement appointment_delete = wait
			.until(ExpectedConditions.elementToBeClickable(Appointment_Deletion.Delete_Second_Appointment));
	
	/*Delete Appointment*/
	appointment_delete.click();
	
	
	
	String winHandleBefore = driver.getWindowHandle();

	// Perform the click operation that opens new window

	// Switch to new window opened
	for(String winHandle : driver.getWindowHandles()){
	    driver.switchTo().window(winHandle);
	}

	WebDriverWait wait1 = new WebDriverWait(driver, 15);
	WebElement appointment_delete_confirm = wait
			.until(ExpectedConditions.elementToBeClickable(Appointment_Deletion.Delete_Appointment_Confirm));
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", appointment_delete_confirm);
	appointment_delete_confirm.click();
	
	Thread.sleep(2000);

	// Close the new window, if that window no more required
	driver.close();

	// Switch back to original browser (first window)
	driver.switchTo().window(winHandleBefore);
	}
	
	
	}
	
	@Then("^Message displayed Appointment Deleted Successfully$")
	public void message_displayed_My_stuff_Successfully_tested() throws Throwable {
		logger.info("My Stuff successfully tested.");
	}
}
