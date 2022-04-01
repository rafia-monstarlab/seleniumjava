package tests;
import org.testng.annotations.Test;

import pages.searchCountrypageobj;

public class SearchHotel extends baseClass{
	
	searchCountrypageobj srchcountry;
	
	@Test (priority = 1, enabled= true)
	public void clickonhotel() {
		srchcountry = new searchCountrypageobj(driver);
		srchcountry.click_hotel();
		System.out.println("----> Clicked Hotel Button");
	}
	
	@Test (priority = 2, enabled= true, dependsOnMethods = {"clickonhotel"})
	public void clickonsearchfield() {
		srchcountry = new searchCountrypageobj(driver);
		srchcountry.search_field();
		System.out.println("----> Clicked on Search field");	
	}
	
	@Test (priority = 3, enabled= true, dependsOnMethods = {"clickonsearchfield"})
	public void sendcountryname() {
		srchcountry = new searchCountrypageobj(driver);
		srchcountry.send_countryname();
		System.out.println("----> Country name inserted");	
	}
	
	
	@Test (priority = 4, enabled= true, dependsOnMethods = {"sendcountryname"})
	public void selectcountryname() throws InterruptedException {
		Thread.sleep(2000);
		srchcountry = new searchCountrypageobj(driver);
		srchcountry.select_countryname();
		System.out.println("----> Countryname selected");
	}
	
	@Test (priority = 5, enabled= true, dependsOnMethods = {"selectcountryname"})
	public void printheading() throws InterruptedException {
		srchcountry.print_heading();
		Thread.sleep(2000);
	}
	
//	@Test (priority = 6, enabled= true, dependsOnMethods = {"selectcountryname"})
//	public void clickCheckinbutton() {
//		srchcountry.checkin_button();
//	}
	
	@Test (priority = 6, enabled= true)
	public void clickCheckindate() {
		srchcountry.click_checkin_date();
	}
	
	@Test (priority = 7, enabled= true, dependsOnMethods = {"clickCheckindate"})
	public void clickCheckoutdate() throws InterruptedException {
		srchcountry.click_checkout_date();
		Thread.sleep(2000);
	}
	
//	@Test (priority = 8, enabled= true, dependsOnMethods = {"clickCheckindate"})
//	public void clickGuestfield() {
//		srchcountry.click_guest_btn();
//	}
//	
	@Test (priority = 8, enabled= true, dependsOnMethods = {"clickCheckoutdate"})
	public void increasechild() {
		srchcountry.click_child_increase_button();
	}
	

	@Test (priority = 9, enabled= true, dependsOnMethods = {"increasechild"})
	public void clickAgedropdown() throws InterruptedException {
		srchcountry.click_age_dropdown();
		Thread.sleep(2000);
	}
	

	@Test (priority = 10, enabled= true, dependsOnMethods = {"clickAgedropdown"})
	public void selectAge() {
		srchcountry.select_age();
	}
	
	@Test (priority = 11, enabled= true, dependsOnMethods = {"selectAge"})
	public void update_button() throws InterruptedException {
		srchcountry.click_guestupdatebtn();
		Thread.sleep(2000);
	}

	
	@Test (priority = 12, enabled= true, dependsOnMethods = {"selectcountryname"})
	public void clickHotelclass() throws InterruptedException {
		srchcountry.click_hotelclass();
		Thread.sleep(2000);
	}
	
	@Test (priority = 13, enabled= true, dependsOnMethods = {"clickHotelclass"})
	public void printHotelname() {
		 srchcountry.print_hotelname();
	}

}
