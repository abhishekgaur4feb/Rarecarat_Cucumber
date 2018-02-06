package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Appointment_Booking_page extends BaseClass{

	public static WebDriver driver;
	public Appointment_Booking_page(WebDriver driver) {
		super(driver);
		}
	
	@FindBy(how=How.XPATH, using=".//*[@id='tabRetailer']/a")
	public static WebElement filter_retailer;
	@FindBy(how=How.XPATH, using=".//*[@id='zipcode-filter']")
	public static WebElement zipcode_filter;
	@FindBy(how=How.XPATH, using=".//*[@id='retailerScroll']/div[2]/label")
	public static WebElement online_check_box;
	@FindBy(how=How.XPATH, using=".//*[@id='divSearchBtn']/div[2]")
	public static WebElement search_button;
	
	//Appointment
	@FindBy(how=How.XPATH,using="html/body/div[2]/div/section/div[3]/div/div[4]/div[1]/div/div/div[1]/div[1]/div[2]/div[1]/span/span")
	public static WebElement list_view;
	@FindBy(how=How.XPATH,using="html/body/div[2]/div/section/div[3]/div/div[4]/div[1]/div/div/div[1]/div[1]/div[2]/div[1]/div[2]")
	public static WebElement list_view_details;
	
	@FindBy(how=How.XPATH,using="html/body/div[2]/div/section/div[3]/div/div[13]/div[2]/div/div[2]/div[3]/div[1]")
	public static WebElement see_in_person;
	
	@FindBy(how=How.XPATH,using="html/body/div[2]/div/section/div[4]/div/div/div[3]/div[2]/div[1]")
	public static WebElement continue_booking;
	
	@FindBy(how=How.XPATH,using="html/body/div[2]/div/section/div[3]/div/div[15]/div[2]/div/div[3]/div[2]/div[1]/div[1]")
	public static WebElement select_location_eastern_dallas;
	
	@FindBy(how=How.XPATH,using="html/body/div[2]/div/section/div[3]/div/div[15]/div[2]/div/div[3]/div[2]/div[1]/div[2]")
	public static WebElement select_location_taxas_united_states;
	
	
	/*Date Available*/
	@FindBy(how=How.XPATH,using=".//*[@id='date-time-0']")
	public static WebElement date_available_1;	
	
	@FindBy(how=How.XPATH,using=".//*[@id='date-time-1']")
	public static WebElement date_available_2;
	
	@FindBy(how=How.XPATH,using=".//*[@id='date-time-2']")
	public static WebElement date_available_3;
	
	@FindBy(how=How.XPATH,using=".//*[@id='date-time-3']")
	public static WebElement date_available_4;
	
	@FindBy(how=How.XPATH,using=".//*[@id='date-time-4']")
	public static WebElement date_available_5;
	
	@FindBy(how=How.XPATH,using=".//*[@id='date-time-5']")
	public static WebElement date_available_6;
	
	@FindBy(how=How.XPATH,using=".//*[@id='date-time-6']")
	public static WebElement date_available_7;
	
	
	
	
	@FindBy(how=How.XPATH,using="intercom-launcher-discovery-frame")
	public static WebElement click_frame;
	
	@FindBy(how=How.XPATH,using=".//*[@id='intercom-container']/div/div/div[1]/div/div[1]/div/img")
	public static WebElement intercome_message;
	
	@FindBy(how=How.XPATH,using=".//*[@id='availableTimeSlots']")
	public static WebElement availableTimeSlots;
	
	/*Time available for Eastern Time Dallas*/
	@FindBy(how=How.XPATH,using=".//*[@id='dtime-0']")
	public static WebElement time_available_eastern_8;
	
	
	@FindBy(how=How.XPATH,using=".//*[@id='dtime-1']")
	public static WebElement time_available_eastern_8_30;
	
	@FindBy(how=How.XPATH,using=".//*[@id='dtime-2']")
	public static WebElement time_available_eastern_9;
	
	@FindBy(how=How.XPATH,using=".//*[@id='dtime-3']")
	public static WebElement time_available_eastern_9_30;
	
	@FindBy(how=How.XPATH,using=".//*[@id='dtime-4']")
	public static WebElement time_available_eastern_10;
	
	@FindBy(how=How.XPATH,using=".//*[@id='dtime-5']")
	public static WebElement time_available_eastern_10_30;
	
	@FindBy(how=How.XPATH,using=".//*[@id='dtime-6']")
	public static WebElement time_available_eastern_11;
	
	@FindBy(how=How.XPATH,using=".//*[@id='dtime-7']")
	public static WebElement time_available_eastern_11_30;
	
	@FindBy(how=How.XPATH,using=".//*[@id='dtime-8']")
	public static WebElement time_available_eastern_12;
	
	@FindBy(how=How.XPATH,using=".//*[@id='dtime-9']")
	public static WebElement time_available_eastern_12_30;
	
	@FindBy(how=How.XPATH,using=".//*[@id='dtime-10']")
	public static WebElement time_available_eastern_1;
	
	@FindBy(how=How.XPATH,using=".//*[@id='dtime-11']")
	public static WebElement time_available_eastern_1_30;
	
	@FindBy(how=How.XPATH,using=".//*[@id='dtime-12']")
	public static WebElement time_available_eastern_2;
	
	@FindBy(how=How.XPATH,using=".//*[@id='dtime-13']")
	public static WebElement time_available_eastern_2_30;
		
	@FindBy(how=How.XPATH,using=".//*[@id='dtime-14']")
	public static WebElement time_available_eastern_3;
	
	@FindBy(how=How.XPATH,using=".//*[@id='dtime-15']")
	public static WebElement time_available_eastern_3_30;
	
	@FindBy(how=How.XPATH,using=".//*[@id='dtime-16']")
	public static WebElement time_available_eastern_4;
	
	@FindBy(how=How.XPATH,using=".//*[@id='dtime-17']")
	public static WebElement time_available_eastern_4_30;
	
		
	@FindBy(how=How.XPATH,using=".//*[@id='newConfirmationDetail']/div[2]/div/div[3]/div[2]")
	public static WebElement scroll;
	
	
	@FindBy(how=How.XPATH,using="html/body/div[2]/div/section/div[3]/div/div[19]/div[2]/div/div[3]/div[2]/div/div/div[3]/button")
	public static WebElement double_confirmation;
	
	@FindBy(how=How.XPATH,using="html/body/div[2]/div/section/div[3]/div/div[17]/div[2]/div/div[2]/div[2]/div/div/div[5]/button[2]")
	public static WebElement second_confirmation;
	
	
	@FindBy(how=How.XPATH,using="html/body/div[2]/div/section/div[3]/div/div[17]/div[2]/div/div[2]/div[3]/div/div/div/span/span")
	public static WebElement limit_exceed;
	
	
	

}
