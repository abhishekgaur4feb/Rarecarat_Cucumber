package Step_Defination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Page_Object.Filter_By_Diamond_page_Cucumber;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import Step_Defination.Hooks;




public class Diamond_Search{
	static final Logger logger = Logger.getLogger(Diamond_Search.class);
	public WebDriver driver;
	
	

	
	@Given("^Open firefox and start application$")
	public void Open_firefox_and_start_application() throws Throwable {
		driver = Hooks.driver;
		BasicConfigurator.configure();
		logger.info("Fetching URL and Opening the Url");
		//driver.get("http://www.rarecarat.com");
		}
	


	@When("^User enters \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and  \"(.*?)\" and \"(.*?)\"$")
	public void Filter_By_Diamond_TestCase(String price_right,String Carat_left, int Color_right_param,int Cut_right_param, int Clarity_right_param) throws InterruptedException {
		BasicConfigurator.configure();
		PageFactory.initElements(driver, Filter_By_Diamond_page_Cucumber.class);
		
		Filter_By_Diamond_page_Cucumber.Search.click();
		
		//Filter_By_Diamond_page_Cucumber fbd = new Filter_By_Diamond_page_Cucumber(driver);
		
		// System.out.println(price_left);
		//logger.info("Clicking on Search by Retailer");
		//fbd.filter_retailer().click();
		//Thread.sleep(2000);
		//logger.info("Removing Offline Retailer check");
		//fbd.offline_check().click();
		// Filter By Diamond
		//fbd.Filter_By_Diamond().click();
		//Thread.sleep(2000);
		Thread.sleep(5000);

		//Filter_By_Diamond_page_Cucumber.Advance_filters.click();
		
		
		
		//Price
		logger.info("Looking for Price in Resource");
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", Filter_By_Diamond_page_Cucumber.pricetextmax);
		Filter_By_Diamond_page_Cucumber.pricetextmax.clear();
		Filter_By_Diamond_page_Cucumber.pricetextmax.sendKeys(Keys.chord(Keys.CONTROL, "a"), price_right);
		Thread.sleep(2000);
		Filter_By_Diamond_page_Cucumber.pricetextmax.sendKeys(Keys.chord(Keys.ENTER));
		logger.info("Price given successfully");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		 jse.executeScript("window.scrollBy(0,-1)", "");
		
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
		
		Thread.sleep(3000);
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
		
		Thread.sleep(2000);
		//result-text
		
	/*	List<WebElement> List = driver.findElements(By.className("result-text"));

	     System.out.println(List.size()); // Print total count

	    for (int i = 0; i<List.size(); i++) 
	    {    
	        System.out.println(List.get(i).getAttribute("innerHTML"));          
	    }*/
		
		
		List<WebElement> iframes1 = driver.findElements(By.className("result-text"));
		for (WebElement iframe1 : iframes1)
		{ System.out.println(iframe1.getAttribute("innerHTML")); }
		
		 
		String URl = driver.getCurrentUrl();
		// URL LINK ADDED by Abhishek
		logger.info("Url Link Clicked-->" + URl);

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total Search Time taken: " + totalTime
				+ "milliseconds");
		logger.info("Total Search Time taken: " + totalTime + "milliseconds");

	}

	@Then("^Message displayed Search Successful$")
	public void Message_displayed_Login_Successfully() throws Throwable {
		logger.info("Search Successful");
	}

	@Then("^Application should be closed$")
	public void application_should_be_closed() throws Throwable {
		
	}

}
