package Page_Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class Filter_By_Diamond_page_Cucumber extends BaseClass{

	public static WebDriver driver;



	public Filter_By_Diamond_page_Cucumber(WebDriver driver){
		super(driver);
	}



	@FindBy(how=How.XPATH, using=".//*[@id='tabDiamond']/a")
	public static WebElement Filter_By_Diamond;

	@FindBy(how=How.XPATH, using="html/body/div[2]/div/section/div[1]/div[1]/div[5]/div[1]/div/div[2]/div[1]/div/div/div[9]/div[2]/div[2]")
	public static WebElement Certification;

	@FindBy(how=How.XPATH, using=".//*[@id='priceMax']")
	public static WebElement pricetextmax;

	@FindBy(how=How.XPATH, using=".//*[@id='caratMin']")
	public static WebElement Carat;

	@FindBy(how=How.XPATH, using=".//*[@id='thelist']/div[6]/div[2]/div[1]/span/span[6]")
	public static WebElement Color_Right;

	@FindBy(how=How.XPATH, using=".//*[@id='thelist']/div[7]/div[2]/div[1]/span/span[6]")
	public static WebElement Clarity_Right;

	@FindBy(how=How.XPATH, using=".//*[@id='thelist']/div[5]/div[2]/div[1]/span/span[6]")
	public static WebElement Cut_right;

	@FindBy(how=How.XPATH, using=".//*[@id='thelist']/div[11]/div/label/div")
	public static WebElement Photo_Video;

	@FindBy(how=How.XPATH, using=".//*[@id='divSearchBtn']/div[2]")
	public static WebElement Search;	

	@FindBy(how=How.XPATH, using=".//*[@id='C4']")
	public static WebElement AGS_check;






}
