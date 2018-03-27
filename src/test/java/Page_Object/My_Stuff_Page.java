package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class My_Stuff_Page extends BaseClass{
	public static WebDriver driver;



	public My_Stuff_Page(WebDriver driver){
		super(driver);
	}
	

	@FindBy(how=How.XPATH, using="html/body/div[2]/div/section/div[3]/div/div[4]/div[1]/div/div/div[1]/div[1]/div[2]/div[1]/div[3]")
	public static WebElement Add_favorite;
	
	@FindBy(how=How.XPATH, using="html/body/div[2]/div/header/div[3]/a[10]/span")
	public static WebElement My_stuff_button;
	
	@FindBy(how=How.XPATH, using=".//*[@id='myFavoriteItems']/div[2]/span[1]/i[2]")
	public static WebElement Remove_favorite;
	
	
	
	@FindBy(how=How.XPATH, using=".//*[@id='myFavoriteItems']/div[2]/span[2]/a/span[12]/span[1]/span[2]")
	public static WebElement Diamond_added;
	
	@FindBy(how=How.XPATH, using=".//*[@id='savedSearch']/div[2]/a[1]/span[1]/span[2]")
	public static WebElement Save_search_shape;
	
	

	
	

}
