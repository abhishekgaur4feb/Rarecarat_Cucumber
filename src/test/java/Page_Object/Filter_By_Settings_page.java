package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Filter_By_Settings_page extends BaseClass {
	public static WebDriver driver;



	public Filter_By_Settings_page(WebDriver driver){
		super(driver);
	}

	@FindBy(how=How.XPATH, using=".//*[@id='tabSettings']/a")
	public static WebElement filter_settings;
	@FindBy(how=How.XPATH, using=".//*[@id='priceMin_settings']")
	public static WebElement price_settings_min;	
	@FindBy(how=How.XPATH, using=".//*[@id='priceMax_settings']")
	public static WebElement price_settings_max;		
	//Style
	@FindBy(how=How.XPATH, using=".//*[@id='1']")
	public static WebElement Solitaire;	
	@FindBy(how=How.XPATH, using=".//*[@id='2']")
	public static WebElement halo;	
	@FindBy(how=How.XPATH, using=".//*[@id='4']")
	public static WebElement sidestone;
	@FindBy(how=How.XPATH, using=".//*[@id='8']")
	public static WebElement threestone;


	@FindBy(how=How.XPATH, using=".//*[@id='m-2']")
	public static WebElement fourteen_k_white_gold;
	@FindBy(how=How.XPATH, using=".//*[@id='m-3']")
	public static WebElement eighteen_k_white_gold;	


	@FindBy(how=How.XPATH, using=".//*[@id='m-4']")
	public static WebElement fourteen_k_yellow_gold;			

	@FindBy(how=How.XPATH, using=".//*[@id='m-5']")
	public static WebElement eighteen_k_yellow_Gold;			


	@FindBy(how=How.XPATH, using=".//*[@id='m-6']")
	public static WebElement fourteen_k_rose_gold;	

	@FindBy(how=How.XPATH, using=".//*[@id='m-7']")
	public static WebElement eighteen_k_rose_Gold;			

	@FindBy(how=How.XPATH, using=".//*[@id='m-1']")
	public static WebElement platinium;			

	@FindBy(how=How.XPATH, using=".//*[@id='m-8']")
	public static WebElement palladium;		

	@FindBy(how=How.XPATH, using=".//*[@id='divSearchBtn']/div[2]")
	public static WebElement search_settings;
}
