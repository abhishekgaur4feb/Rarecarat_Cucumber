package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login_page_object extends BaseClass{

	public static WebDriver driver;



	public Login_page_object(WebDriver driver){
		super(driver);
	}
	

	@FindBy(how=How.XPATH, using=".//*[@id='divDiamondController']/header/div[3]/a[10]/span")
	public static WebElement gobutton;
	@FindBy(how=How.XPATH, using=".//*[@id='loginAlert']/div[2]/div/div/div[2]/div[4]/div[2]/a[3]")
	public static WebElement RareCarat;
	@FindBy(how=How.XPATH, using=".//*[@id='loginRareCarat']/div[1]/form/button[2]")
	public static WebElement NewUser;
	@FindBy(how=How.XPATH, using=".//*[@id='loginRareCarat']/div[1]/form/button[1]")
	public static WebElement Login;
	@FindBy(how=How.XPATH, using=".//*[@id='UserName']")
	public static WebElement Login_Username;
	@FindBy(how=How.XPATH, using=".//*[@id='Password']")
	public static WebElement Login_Password;
	@FindBy(how=How.XPATH, using=".//*[@id='FirstName']")
	public static WebElement FirstName;
	@FindBy(how=How.XPATH, using=".//*[@id='LastName']")
	public static WebElement LastName;
	@FindBy(how=How.XPATH, using="html/body/div[5]/div[2]/div/div/div[2]/div[3]/div[3]/input")
	public static WebElement MailID;
	@FindBy(how=How.XPATH, using="html/body/div[5]/div[2]/div/div/div[2]/div[3]/div[4]/input")
	public static WebElement Signup_Password;
	@FindBy(how=How.XPATH, using="html/body/div[5]/div[2]/div/div/div[2]/div[3]/button[1]")
	public static WebElement Sign_up_button;
	@FindBy(how=How.XPATH, using=".//*[@id='signUpRareCarat']/span[3]")
	public static WebElement Message_already_registered;
	@FindBy(how=How.XPATH, using=".//*[@id='signUpRareCarat']/span[1]")
	public static WebElement Message_success;
}
