package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Appointment_Deletion extends BaseClass{

	public static WebDriver driver;
	public Appointment_Deletion(WebDriver driver) {
		super(driver);
		}
	
	@FindBy(how=How.XPATH, using="html/body/div[2]/section/section/div/div/section[3]/div/div[4]/div[2]/div[2]/span[1]/a[2]/i")
	public static WebElement Delete_First_Appointment;
	
	@FindBy(how=How.XPATH, using="html/body/div[2]/section/section/div/div/section[3]/div/div[4]/div[2]/div[3]/span[1]/a[2]/i")
	public static WebElement Delete_Second_Appointment;
	
	
	@FindBy(how=How.XPATH, using="//*[@id='appointmentCancelPopup']/div[2]/div/div[2]/div[2]/div/div/div[4]/button[1]")
	public static WebElement Delete_Appointment_Confirm;
	
	
}
