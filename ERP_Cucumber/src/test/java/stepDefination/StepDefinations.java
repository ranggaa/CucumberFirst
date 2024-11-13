package stepDefination;

import org.openqa.selenium.WebDriver;

import commonFunctions.FunctionLibrary;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinations {
	WebDriver driver;
	@Given("Users launch Browser")
	public void users_launch_Browser() throws Throwable {
	   driver = FunctionLibrary.startBrowser();
	}

	@When("user launch Url")
	public void user_launch_Url() {
	    FunctionLibrary.openUrl();
	}

	@When("Wait for username with {string} and {string} and {string}")
	public void wait_for_username_with_and_and(String Ltype, String Lvalue, String waittime) {
	    FunctionLibrary.waitForElement(Ltype, Lvalue, waittime);
	}

	@When("Enter user name with {string} and {string} and {string}")
	public void enter_user_name_with_and_and(String LType, String Lvalue, String TestData) {
	    FunctionLibrary.typeAction(LType, Lvalue, TestData);
	}

	@When("Enter password  with {string} and {string} and {string}")
	public void enter_password_with_and_and(String LType, String Lvalue, String TestData) {
	    FunctionLibrary.typeAction(LType, Lvalue, TestData);
	}

	@When("Click login button with {string} and {string}")
	public void click_login_button_with_and(String Ltype, String Lvalue) {
	    FunctionLibrary.clickAction(Ltype, Lvalue);
	}

	@When("Wait for logout link with {string} and {string} and {string}")
	public void wait_for_logout_link_with_and_and(String Ltype, String Lvalue, String waittime) {
	    FunctionLibrary.waitForElement(Ltype, Lvalue, waittime);
	}

	@Then("Validate Title with {string}")
	public void validate_Title_with(String Expected_title) {
	    FunctionLibrary.validateTitle(Expected_title);
	}

	@When("Wait for supplier link with {string} and {string} and {string}")
	public void wait_for_supplier_link_with_and_and(String Ltype, String Lvalue, String waittime) {
	    FunctionLibrary.waitForElement(Ltype, Lvalue, waittime);
	}

	@When("Click Supplier link with {string} and {string}")
	public void click_Supplier_link_with_and(String Ltype, String Lvalue) {
	    FunctionLibrary.clickAction(Ltype, Lvalue);
	}

	@When("Wait for Add icon with {string} and {string} and {string}")
	public void wait_for_Add_icon_with_and_and(String Ltype, String Lvalue, String waittime) {
	    FunctionLibrary.waitForElement(Ltype, Lvalue, waittime);
	}

	@When("click Add Icon {string} and {string}")
	public void click_Add_Icon_and(String Ltype, String Lvalue) {
	   FunctionLibrary.clickAction(Ltype, Lvalue);
	}

	@When("Wait for supplier number with {string} and {string} and {string}")
	public void wait_for_supplier_number_with_and_and(String Ltype, String Lvalue, String waittime) {
	    FunctionLibrary.waitForElement(Ltype, Lvalue, waittime);
	}

	@When("Capture Supplier number  with {string} and {string}")
	public void capture_Supplier_number_with_and(String Ltype, String Lvalue) throws Throwable {
	   FunctionLibrary.captureSup(Ltype, Lvalue);
	}

	@When("Enter in {string} with {string} and {string}")
	public void enter_in_with_and(String TestData, String Ltype, String Lvalue) {
	    FunctionLibrary.typeAction(Ltype, Lvalue, TestData);
	}

	@When("Click Add button with {string} and {string}")
	public void click_Add_button_with_and(String Ltype, String Lvalue) {
	   FunctionLibrary.clickAction(Ltype, Lvalue);
	}

	@When("Wait for Confirm Ok button with {string} and {string} and {string}")
	public void wait_for_Confirm_Ok_button_with_and_and(String Ltype, String Lvalue, String waittime) {
	    FunctionLibrary.waitForElement(Ltype, Lvalue, waittime);
	}

	@When("Click Confirm Ok with {string} and {string}")
	public void click_Confirm_Ok_with_and(String Ltype, String Lvalue) {
	    FunctionLibrary.clickAction(Ltype, Lvalue);
	}

	@When("Wait for Alert Ok button with {string} and {string} and {string}")
	public void wait_for_Alert_Ok_button_with_and_and(String Ltype, String Lvalue, String waittime) {
	   FunctionLibrary.waitForElement(Ltype, Lvalue, waittime); 
	}

	@When("Click Alert ok button with {string} and {string}")
	public void click_Alert_ok_button_with_and(String Ltype, String Lvalue) {
	   FunctionLibrary.clickAction(Ltype, Lvalue);
	}

	@Then("Validate Supplier number")
	public void validate_Supplier_number() throws Throwable {
	    FunctionLibrary.supplierTable();
	}

	@When("close browser")
	public void close_browser() {
	    FunctionLibrary.closeBrowser();
	}

	@When("Wait for Customer link with {string} and {string} and {string}")
	public void wait_for_Customer_link_with_and_and(String Ltype, String Lvalue, String waittime) {
	   FunctionLibrary.waitForElement(Ltype, Lvalue, waittime);
	}

	@When("Click Customer link with {string} and {string}")
	public void click_Customer_link_with_and(String Ltype, String Lvalue) {
	   FunctionLibrary.clickAction(Ltype, Lvalue);
	}

	@When("Wait for Customer number with {string} and {string} and {string}")
	public void wait_for_Customer_number_with_and_and(String Ltype, String Lvalue, String waittime) {
	   FunctionLibrary.waitForElement(Ltype, Lvalue, waittime); 
	}

	@When("Capture Customer number  with {string} and {string}")
	public void capture_Customer_number_with_and(String Ltype, String Lvalue) throws Throwable {
	    FunctionLibrary.captureCus(Ltype, Lvalue);
	}

	@Then("Validate customer number")
	public void validate_customer_number() throws Throwable {
	    FunctionLibrary.customerTable();
	}


}
