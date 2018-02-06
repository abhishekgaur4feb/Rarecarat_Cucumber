package Step_Defination;

import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Page_Object.Appointment_Booking_page;
import Page_Object.Filter_By_Diamond_page_Cucumber;
import Page_Object.Login_page_object;
import Page_Object.My_Stuff_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class My_Stuff_Step {
	static final Logger logger = Logger.getLogger(Login_feature_step.class);
	public WebDriver driver;

	@Given("^Open browser for My Stuff$")
	public void Open_firefox_and_start_application() throws Throwable {
		driver = Hooks.driver;
		BasicConfigurator.configure();
		logger.info("Fetching URL and Opening the Url");
		//driver.get("http://www.rarecarat.com");
	}

	@When("^Existing User enters for My Stuff \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and  \"(.*?)\" and \"(.*?)\"$")
	public void existing_User_enters_for_My_Stuff_and(String uname, String password,String price_right,String Carat_left, int Color_right_param,int Cut_right_param, int Clarity_right_param) throws Throwable {
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

		logger.info("Clicked on login Provide username ans password");
		
		PageFactory.initElements(driver, My_Stuff_Page.class);
		
/*		Thread.sleep(4000);
		My_Stuff_Page.My_stuff_button.click();
		Thread.sleep(4000);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", My_Stuff_Page.Remove_favorite);
		My_Stuff_Page.Remove_favorite.click();*/
		
		

		Thread.sleep(5000);
		/*Clicked on Search*/
		/*Initialization*/
		PageFactory.initElements(driver, Filter_By_Diamond_page_Cucumber.class);

		/*Narrow Search */

		//Price
		logger.info("Looking for Price in Resource");
		Filter_By_Diamond_page_Cucumber.pricetextmax.clear();
		Filter_By_Diamond_page_Cucumber.pricetextmax.sendKeys(Keys.chord(Keys.CONTROL, "a"), price_right);
		Thread.sleep(2000);
		Filter_By_Diamond_page_Cucumber.pricetextmax.sendKeys(Keys.chord(Keys.ENTER));
		logger.info("Price given successfully");


		//Carat

		logger.info("Looking for Carat in Resource");
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", Filter_By_Diamond_page_Cucumber.Carat);
		Filter_By_Diamond_page_Cucumber.Carat.clear();
		Filter_By_Diamond_page_Cucumber.Carat.sendKeys(Keys.chord(Keys.CONTROL, "a"), Carat_left);
		Filter_By_Diamond_page_Cucumber.Carat.sendKeys(Keys.chord(Keys.ENTER));
		logger.info("Carat given successfully");
		Thread.sleep(2000);


		//CUT
		logger.info("Looking for Cut in XML");
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", Filter_By_Diamond_page_Cucumber.Cut_right);
		//Identify WebElement
		//WebElement sliderM3 = fbd.Cut_left();	  
		// new Actions(driver).dragAndDropBy(sliderM3,Cut_left_param, 0).build().perform();
		Thread.sleep(2000);
		WebElement sliderM4 = Filter_By_Diamond_page_Cucumber.Cut_right;
		new Actions(driver).dragAndDropBy(sliderM4,Cut_right_param, 0).build().perform();
		logger.info("Cut selected successfully");



		logger.info("Looking in Xml for Color");
		//COLOR
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", Filter_By_Diamond_page_Cucumber.Color_Right);
		//Identify WebElement
		//WebElement sliderM1 = fbd.Color_left();	  
		// new Actions(driver).dragAndDropBy(sliderM1,Color_left_param, 0).build().perform();
		Thread.sleep(2000);
		WebElement sliderM2 = Filter_By_Diamond_page_Cucumber.Color_Right;
		new Actions(driver).dragAndDropBy(sliderM2,Color_right_param, 0).build().perform();
		logger.info("Color selected successfully");



		//CLARITY
		logger.info("Looking in Xml for Clarity");
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", Filter_By_Diamond_page_Cucumber.Clarity_Right);
		//Identify WebElement
		//WebElement sliderM5 = fbd.Clarity_left();	  
		//new Actions(driver).dragAndDropBy(sliderM5,Clarity_left_param, 0).build().perform();
		Thread.sleep(2000);
		WebElement sliderM6 = Filter_By_Diamond_page_Cucumber.Clarity_Right;
		new Actions(driver).dragAndDropBy(sliderM6,Clarity_right_param, 0).build().perform();
		logger.info("Clarity selected successfully");

		Filter_By_Diamond_page_Cucumber.AGS_check.click();

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", Filter_By_Diamond_page_Cucumber.Photo_Video);
		Filter_By_Diamond_page_Cucumber.Photo_Video.click();
		// Thread.sleep(2000);
		// Click on Search Button
		long startTime = System.currentTimeMillis();
		logger.info("Test start Time" + startTime);

		Filter_By_Diamond_page_Cucumber.Search.click();
		// Thread.sleep(2000);

		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By
						.xpath("html/body/div[2]/div/section/div[3]/div/div[4]/div[1]/div/div/div[1]/div[1]/div[2]/div[1]/span/span")));
		element.click();
		// Thread.sleep(2000);
		String URl = driver.getCurrentUrl();
		
		logger.info("Url Link Clicked-->" + URl);

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total Search Time taken: " + totalTime
				+ "milliseconds");
		logger.info("Total Search Time taken: " + totalTime + "milliseconds");


		/*My Stuff Page Initialization*/
		
		My_Stuff_Page.Add_favorite.click();

		Thread.sleep(4000);
		My_Stuff_Page.My_stuff_button.click();
		Thread.sleep(4000);

		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", My_Stuff_Page.Diamond_added);
		String Diamond_added= My_Stuff_Page.Diamond_added.getText();
		System.out.println("New Diamond Added-->"+Diamond_added);

		/*Validation Step*/
		logger.info("Validating Diamond added in My Stuff or not");
		Assert.assertEquals("RC Trusted Jeweler", Diamond_added);
		logger.info("Assertion Passed for diamond added");
		Thread.sleep(4000);
		
	



	}

	@Then("^Message displayed My stuff Successfully tested\\.$")
	public void message_displayed_My_stuff_Successfully_tested() throws Throwable {
		logger.info("My Stuff successfully tested.");
	}

}
