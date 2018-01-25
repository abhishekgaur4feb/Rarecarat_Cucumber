package Step_Defination;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Page_Object.Filter_By_Settings_page;
import Page_Object.Login_page_object;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Filter_by_setting_step {
	static final Logger logger = Logger.getLogger(Login_feature_step.class);
	public WebDriver driver;

	
	@Given("^Open browser for Filter By Settings$")
	public void open_browser_for_Filter_By_Settings() throws Throwable {
	    driver = Hooks.driver;
		BasicConfigurator.configure();
		logger.info("Fetching URL and Opening the Url");
	    
	}

	@When("^RareCarat User enters \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
	public void rarecarat_User_enters_and_and_and(String Setting_Price_Min, String Setting_Price_Max, String Style, String Metal) throws Throwable {
		BasicConfigurator.configure();

		PageFactory.initElements(driver, Filter_By_Settings_page.class);
		
		//Click on Filter CLicked
		Filter_By_Settings_page.filter_settings.click();
		Thread.sleep(2000);
		logger.info("Clicked on Filter by Settings tab");
		System.out.println(Setting_Price_Min);
	
		System.out.println("Setting_Price_Min-->"+Setting_Price_Min);
		
		//Price_settings
		logger.info("Looking for Minimum price in XML");
		Thread.sleep(2000);
		
		Filter_By_Settings_page.price_settings_min.clear();
		Filter_By_Settings_page.price_settings_min.sendKeys(Keys.chord(Keys.CONTROL, "a"), Setting_Price_Min);
		Thread.sleep(2000);
		Filter_By_Settings_page.price_settings_min.sendKeys(Keys.chord(Keys.ENTER));
		logger.info("Price given successfully");
		
		logger.info("Looking for Max Price in XML");
		Filter_By_Settings_page.price_settings_max.clear();
		Filter_By_Settings_page.price_settings_max.sendKeys(Keys.chord(Keys.CONTROL, "a"), Setting_Price_Max);
		Thread.sleep(2000);
		Filter_By_Settings_page.price_settings_max.sendKeys(Keys.chord(Keys.ENTER));
		logger.info("Price given successfully");
		
		
		
		
		System.out.println("Style is -->"+Style);
		//Click Solitaire for removal of Selection
		if(Style.contains("Solitaire")){
			Filter_By_Settings_page.Solitaire.click();
			Thread.sleep(2000);
			logger.info("Clicked on Solitaire");
			}
		if(Style.contains("halo")){
			Filter_By_Settings_page.halo.click();
			Thread.sleep(2000);
			logger.info("Clicked on halo");
			}
		if(Style.contains("SideStone")) {
			Filter_By_Settings_page.sidestone.click();
			Thread.sleep(2000);
			logger.info("Clicked on Sidestone");
	    
		}
		if(Style.contains("ThreeStone")){
			Filter_By_Settings_page.threestone.click();
			Thread.sleep(2000);
			logger.info("Clicked on ThreeStone");
		}
		
		//Metal
		//White Gold
		if(Metal.contains("fourteen_k_white_gold")){
			Filter_By_Settings_page.fourteen_k_white_gold.click();
			Thread.sleep(2000);
			logger.info("Clicked on fourteen_k_white_gold");
		}
		if(Metal.contains("eighteen_k_white_gold")){
			Filter_By_Settings_page.eighteen_k_white_gold.click();
			Thread.sleep(2000);
			logger.info("Clicked on eighteen_k_white_gold");
		}
		
		//Yellow Gold
		if(Metal.contains("fourteen_k_yellow_gold")){
			Filter_By_Settings_page.fourteen_k_yellow_gold.click();
			Thread.sleep(2000);
			logger.info("Clicked on fourteen_k_yellow_gold");
		}
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",Filter_By_Settings_page.eighteen_k_yellow_Gold);
		if(Metal.contains("eighteen_k_yellow_Gold")){
			Filter_By_Settings_page.eighteen_k_yellow_Gold.click();
			Thread.sleep(2000);
			logger.info("Clicked on eighteen_k_yellow_Gold");
		}
		
		//Rose Gold
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",Filter_By_Settings_page.fourteen_k_rose_gold);
		if(Metal.contains("fourteen_k_rose_gold")){
			Filter_By_Settings_page.fourteen_k_rose_gold.click();
			Thread.sleep(2000);
			logger.info("Clicked on fourteen_k_rose_gold");
		}	
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",Filter_By_Settings_page.eighteen_k_rose_Gold);
		if(Metal.contains("eighteen_k_rose_Gold")){
			Filter_By_Settings_page.eighteen_k_rose_Gold.click();
			Thread.sleep(2000);
			logger.info("Clicked on eighteen_k_rose_Gold");
		}	
		
		//Platinium
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",Filter_By_Settings_page.platinium);
		if(Metal.contains("platinium")){
			Filter_By_Settings_page.platinium.click();
			Thread.sleep(2000);
			logger.info("Clicked on platinium");
		}
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",Filter_By_Settings_page.palladium);
		if(Metal.contains("palladium")){
			Filter_By_Settings_page.palladium.click();
			Thread.sleep(2000);
			logger.info("Clicked on palladium");
		}
		
		Filter_By_Settings_page.search_settings.click();
		Thread.sleep(2000);
		
}
	    
	

	@Then("^Message displayed Filter By Setting Successful$")
	public void message_displayed_Filter_By_Setting_Successful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
