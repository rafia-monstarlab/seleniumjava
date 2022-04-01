package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchCountrypageobj {

public searchCountrypageobj(WebDriver driver) {
	 PageFactory.initElements(driver, this);
 }
 
 
 @FindBy(xpath="//a[@href=\"/Hotels\"]") WebElement hotel_btn;
 public void click_hotel() {
	 hotel_btn.click();
 }
 
 @FindBy(xpath="/html/body/div[2]/div/form/input[1]") WebElement search_field;
 public void search_field() {
	 search_field.click();
 }
 
 public void send_countryname() {
	 search_field.sendKeys("Switzerland");
 }
 
 @FindBy(xpath="//a[1]//div[@class='faliU']") WebElement select_countryname;
 public void select_countryname() {
	 select_countryname.click();
 }
 
 @FindBy(xpath="//div[@id='HEADING']") WebElement print_heading;
 public void print_heading() {
	 System.out.println("----> Heading is: "+ print_heading.getText());
//		return name;
 }
 
 @FindBy(xpath="//span[contains(text(), 'Check In')]") WebElement checkin_button;
	public void checkin_button() {
		checkin_button.click();
	 }
	 
	 
	 @FindBy(xpath="//button[@data-testid='nav_next']") WebElement navnext_button;
	 public void navnext_button() {
		 navnext_button.click();
	 }
	 
//	 @FindBy(xpath="//div[@class='fylXE'][4]/div[4][@aria-label='Wed Apr 20 2022']") WebElement click_checkin_date;
//	 public void click_checkin_date() {
//		 click_checkin_date.click();
//	 }
	 
	 @FindBy(xpath="//*[@id='BODY_BLOCK_JQUERY_REFLOW']/div[5]/div[2]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[4]") WebElement click_checkin_date;
	 public void click_checkin_date() {
		 click_checkin_date.click();
	 }
	 
	 @FindBy(xpath="//div[@class='fylXE'][5]/div[2][@aria-label='Mon Apr 25 2022']") WebElement click_checkout_date;
	 public void click_checkout_date() {
		 click_checkout_date.click();
	 }
	 
	 @FindBy(xpath="//span[contains(text(),'Guests')]") WebElement click_guest_btn;
	 public void click_guest_btn() {
		 click_guest_btn.click();
	 }
	 
	 @FindBy(xpath="//button[@data-automation='childrenMore']") WebElement click_child_increase_button;
	 public void click_child_increase_button() {
		 click_child_increase_button.click();
	 }
	
	 @FindBy(xpath="//div[@data-automation='guestsUpdateBtn']") WebElement click_guestupdatebtn;
	 public void click_guestupdatebtn() {
		 click_guestupdatebtn.click();
	 }
	 
//	 @FindBy(xpath="//*[@id='BODY_BLOCK_JQUERY_REFLOW']/div[7]/div/div/div/div[2]/button[4]/span[contains(text(),3)]") WebElement select_age;
	 @FindBy(xpath="//*[@id='BODY_BLOCK_JQUERY_REFLOW']/div[6]/div/div/div/div[2]/button[3]") WebElement select_age;
	 public void select_age() {
		 select_age.click();
	 }
	 
	 @FindBy(xpath="//button[@data-automation='child0']") WebElement click_age_dropdown;
	 public void click_age_dropdown() {
		 click_age_dropdown.click();
	 }
	 
	 
	 @FindBy(xpath="//label[@for='checkbox_14']") WebElement click_hotelclass;
	 public void click_hotelclass() {
		 click_hotelclass.click();
	 }
	 
	 @FindBy(xpath="//*[@id='taplc_hsx_hotel_list_lite_dusty_hotels_combined_sponsored_0']/div[2]/div/div/div[2]/div[1]/div/a") WebElement print_hotelname;
	 public void print_hotelname() {
		 System.out.println("----> Heading is: "+ print_hotelname.getText());
	 }
 
}
