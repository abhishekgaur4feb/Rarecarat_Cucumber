package Step_Defination;

import java.time.LocalDate;
import java.util.Date;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Page_Object.Appointment_Booking_page;
import Page_Object.Filter_By_Diamond_page_Cucumber;
import Page_Object.Login_page_object;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Abhishek Gaur
 *
 */
public class Appointment_Booking_step {
	static final Logger logger = Logger.getLogger(Login_feature_step.class);
	public WebDriver driver;
	
	@Given("^Open browser for Appointment Booking$")
	public void open_browser_for_Appointment_Booking() throws Throwable {
		driver = Hooks.driver;
		BasicConfigurator.configure();
		logger.info("Fetching URL and Opening the Url");
	    
	}
	
	@When("^Existing User enters \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
	public void existing_User_enters_and_and_and_and_and(String uname, String password, String zipcode, String location, String date_available, String time_available,int appointment_time) throws Throwable {
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
		
		Thread.sleep(2000);
		logger.info("Clicked on login Provide username and password");
		Thread.sleep(4000);
		
		PageFactory.initElements(driver, Filter_By_Diamond_page_Cucumber.class);
		Filter_By_Diamond_page_Cucumber.Search.click();
		
		Thread.sleep(2000);
		//Appointment
		//Initialization
		PageFactory.initElements(driver, Appointment_Booking_page.class);
		Appointment_Booking_page.filter_retailer.click();
		Thread.sleep(2000);
		logger.info("Clicked on Filter by Retailer tab");
		
		
		logger.info("Looking for zipcode in Resource File");
		//boolean status=Appointment_Booking_page.zipcode_filter.isDisplayed();
		//System.out.println("Currently Offline filter visible -->" +status);
		//logger.info("Currently Offline filter visible -->" + status + "Kindly check the reason behind");
		//if(Appointment_Booking_page.zipcode_filter.isDisplayed()){
			
		Appointment_Booking_page.zipcode_filter.clear();
		Appointment_Booking_page.zipcode_filter.sendKeys(Keys.chord(Keys.CONTROL, "a"), zipcode);
		Thread.sleep(2000);
		Appointment_Booking_page.zipcode_filter.sendKeys(Keys.chord(Keys.ENTER));
		logger.info("Test Retailer Zipcode replaced successfully");
		Thread.sleep(2000);
		
		Appointment_Booking_page.online_check_box.click();
	
		
		Appointment_Booking_page.search_button.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By
						.xpath("html/body/div[2]/div/section/section[1]/div[3]/div[5]/div[1]/div/div/div[1]/div[1]/div[2]/div[1]/span/span")));
		//element.click();
		
		
		//Appointment Started
	
		Thread.sleep(2000);
		Appointment_Booking_page.list_view.click();
		String URl = driver.getCurrentUrl();
		System.out.println("Current Url clicked-->" +URl);
		logger.info("Clicked on List View");
		
		Thread.sleep(2000);
		logger.info("Clicking on Diamond Details");
		Appointment_Booking_page.list_view_details.click();
		Thread.sleep(2000);
		
		logger.info("Clicking on See in Person to book an appointment");
		Appointment_Booking_page.see_in_person.click();
		Thread.sleep(2000);
		
		//logger.info("Clicking on Continue to book an appointment");
		//Appointment_Booking_page.continue_booking.click();
		//Thread.sleep(4000);
		//System.out.println("Hi i am abhishek");
		
		//1st time appointment
		
		
		if(appointment_time==1){
			
		Thread.sleep(2000);
		logger.info("Fetching location from Resource File");
		System.out.println("Location fetched-->"+location);
		if(location.contains("EasternTimeDallas")){
			Appointment_Booking_page.select_location_eastern_dallas.click();
			Thread.sleep(2000);
			logger.info("Clicked on Eastern Time,DALLAS");
			}
		if(location.contains("TexasUnitedStates")){
			Appointment_Booking_page.select_location_taxas_united_states.click();
			Thread.sleep(2000);
			logger.info("Clicked on Pacific Time, Dallas, TX, United States");
			}
		
		
		switch(date_available){    
		case "NOW+1":  Appointment_Booking_page.date_available_1.click(); 
		break;
		
		case "NOW+2":  Appointment_Booking_page.date_available_2.click(); 
		break;
		case "NOW+3":  Appointment_Booking_page.date_available_3.click(); 
		break;
		case "NOW+4":  Appointment_Booking_page.date_available_4.click(); 
		break;
		case "NOW+5":  Appointment_Booking_page.date_available_5.click(); 
		break;
		case "NOW+6":  Appointment_Booking_page.date_available_6.click(); 
		break;
		case "NOW+7":  Appointment_Booking_page.date_available_7.click(); 
		break;
		}
				
		/*driver.switchTo().frame(Appointment_Booking_page.click_frame);
		
		Appointment_Booking_page.intercome_message.click();
		Thread.sleep(1000);
		Appointment_Booking_page.intercome_message.click();
		driver.switchTo().defaultContent();*/
		
		//Thread.sleep(2000);
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", Appointment_Booking_page.availableTimeSlots);
		//Appointment_Booking_page.availableTimeSlots.click();
		Thread.sleep(3000);

		/*Eastern Timings */
		switch(time_available){    
		case "8:00":  Appointment_Booking_page.time_available_eastern_8.click(); 
		break;
		case "8:30": Appointment_Booking_page.time_available_eastern_8_30.click();
		break;
		case "9:00":  Appointment_Booking_page.time_available_eastern_9.click(); 
		break;
		case "9:30":  Appointment_Booking_page.time_available_eastern_9_30.click(); 
		break;
		case "10:00":  Appointment_Booking_page.time_available_eastern_10.click(); 
		break;
		case "10:30":  Appointment_Booking_page.time_available_eastern_10_30.click(); 
		break;
		case "11:00":  Appointment_Booking_page.time_available_eastern_11.click(); 
		break;
		case "11:30":  Appointment_Booking_page.time_available_eastern_11_30.click(); 
		break;
		case "12:00":  Appointment_Booking_page.time_available_eastern_12.click(); 
		break;
		case "12:30":  Appointment_Booking_page.time_available_eastern_12_30.click(); 
		break;
		case "1:00":  Appointment_Booking_page.time_available_eastern_1.click(); 
		break;
		case "1:30":  Appointment_Booking_page.time_available_eastern_1_30.click(); 
		break;
		case "2:00":  Appointment_Booking_page.time_available_eastern_2.click(); 
		break;
		case "2:30":  Appointment_Booking_page.time_available_eastern_2_30.click(); 
		break;
		case "3:00":  Appointment_Booking_page.time_available_eastern_3.click(); 
		break;
		case "3:30":  Appointment_Booking_page.time_available_eastern_3_30.click(); 
		break;
		case "4:00":  Appointment_Booking_page.time_available_eastern_4.click(); 
		break;
		case "4:30":  Appointment_Booking_page.time_available_eastern_4_30.click(); 
		break;
		}
		
		Thread.sleep(6000);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", Appointment_Booking_page.scroll);
		Appointment_Booking_page.double_confirmation.click();
		Thread.sleep(2000);
		
		logger.info("Appointment booked 1st time via Rarecarat login");
		Thread.sleep(2000);
		}
		
		if(appointment_time==2)
		{
			Thread.sleep(2000);
			if(Appointment_Booking_page.second_confirmation.isEnabled()){
				//Thread.sleep(2000);
				Appointment_Booking_page.second_confirmation.click();
				Thread.sleep(2000);
				
				logger.info("Fetching location from Resource File");
				System.out.println("Location fetched-->"+location);
				if(location.contains("EasternTimeDallas")){
					Appointment_Booking_page.select_location_eastern_dallas.click();
					Thread.sleep(2000);
					logger.info("Clicked on Eastern Time,DALLAS");
					}
				if(location.contains("TexasUnitedStates")){
					Appointment_Booking_page.select_location_taxas_united_states.click();
					Thread.sleep(2000);
					logger.info("Clicked on Pacific Time, Dallas, TX, United States");
					}
				
				switch(date_available){    
				case "NOW+1":  Appointment_Booking_page.date_available_1.click(); 
				break;
				
				case "NOW+2":  Appointment_Booking_page.date_available_2.click(); 
				break;
				case "NOW+3":  Appointment_Booking_page.date_available_3.click(); 
				break;
				case "NOW+4":  Appointment_Booking_page.date_available_4.click(); 
				break;
				case "NOW+5":  Appointment_Booking_page.date_available_5.click(); 
				break;
				case "NOW+6":  Appointment_Booking_page.date_available_6.click(); 
				break;
				case "NOW+7":  Appointment_Booking_page.date_available_7.click(); 
				break;
				}
				
				Thread.sleep(2000);
				
				
				/*driver.switchTo().frame(Appointment_Booking_page.click_frame);
				
				Appointment_Booking_page.intercome_message.click();
				Thread.sleep(1000);
				Appointment_Booking_page.intercome_message.click();
				driver.switchTo().defaultContent();*/
				
				//Thread.sleep(2000);
				//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", Appointment_Booking_page.availableTimeSlots);
				//Appointment_Booking_page.availableTimeSlots.click();
				
				
				
				/*Eastern Timings */
				switch(time_available){    
				case "8:00":  Appointment_Booking_page.time_available_eastern_8.click(); 
				break;
				case "8:30": Appointment_Booking_page.time_available_eastern_8_30.click();
				break;
				case "9:00":  Appointment_Booking_page.time_available_eastern_9.click(); 
				break;
				case "9:30":  Appointment_Booking_page.time_available_eastern_9_30.click(); 
				break;
				case "10:00":  Appointment_Booking_page.time_available_eastern_10.click(); 
				break;
				case "10:30":  Appointment_Booking_page.time_available_eastern_10_30.click(); 
				break;
				case "11:00":  Appointment_Booking_page.time_available_eastern_11.click(); 
				break;
				case "11:30":  Appointment_Booking_page.time_available_eastern_11_30.click(); 
				break;
				case "12:00":  Appointment_Booking_page.time_available_eastern_12.click(); 
				break;
				case "12:30":  Appointment_Booking_page.time_available_eastern_12_30.click(); 
				break;
				case "1:00":  Appointment_Booking_page.time_available_eastern_1.click(); 
				break;
				case "1:30":  Appointment_Booking_page.time_available_eastern_1_30.click(); 
				break;
				case "2:00":  Appointment_Booking_page.time_available_eastern_2.click(); 
				break;
				case "2:30":  Appointment_Booking_page.time_available_eastern_2_30.click(); 
				break;
				case "3:00":  Appointment_Booking_page.time_available_eastern_3.click(); 
				break;
				case "3:30":  Appointment_Booking_page.time_available_eastern_3_30.click(); 
				break;
				case "4:00":  Appointment_Booking_page.time_available_eastern_4.click(); 
				break;
				case "4:30":  Appointment_Booking_page.time_available_eastern_4_30.click(); 
				break;
				}
				
				Thread.sleep(5000);
				((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", Appointment_Booking_page.scroll);
				Appointment_Booking_page.double_confirmation.click();
				Thread.sleep(2000);
				
				logger.info("Appointment booked 2nd time via Rarecarat login");
				Thread.sleep(2000);	
			}
		}
			else{
				
				logger.info("Alert! you have already booked 2 appointments");
				Thread.sleep(2000);
			}

		}
					
		
		
		
	
	
   
	

	@Then("^Message displayed Login Successful for Appointment Booking$")
	public void message_displayed_Login_Successful_for_Appointment_Booking() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
